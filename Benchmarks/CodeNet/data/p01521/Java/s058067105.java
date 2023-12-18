import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

import javax.print.attribute.standard.MediaSize.Other;
import javax.xml.bind.ParseConversionEvent;

public class Main {

	public static long hash(boolean[] array, boolean turn){
		long ret = 0;
		
		for(int i = 1; i < array.length + 1; i++){
			if(array[i-1]){
				ret |= 1 << i;
			}
		}
		
		//ret |= array.length << (array.length + 2);
		
		ret |= turn ? 1 : 0;
		
		return ret;
	}
	
	public static class Throw {
		boolean[] othero;
		boolean turn;

		public Throw(boolean[] othero, boolean turn) {
			this.othero = othero;
			this.turn = turn;
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		LinkedList<Throw> queue = new LinkedList<Throw>();
		HashSet<Long> set = new HashSet<Long>();
		boolean[] first = new boolean[input.length()];

		for (int i = 0; i < first.length; i++) {
			first[i] = input.charAt(i) == 'o';
		}

		queue.add(new Throw(first, true));

		int o_win = 0, x_win = 0;

		while (!queue.isEmpty()) {
			Throw th = queue.poll();

			//System.out.println(Arrays.toString(th.othero) + " & " + th.turn);
			
			if(set.contains(hash(th.othero, th.turn))){
				continue;
			}else{
				set.add(hash(th.othero, th.turn));
			}

			boolean win = true;

			for (int i = 0; i < th.othero.length; i++) {
				if (th.othero[i] != th.turn) {
					win = false;
					break;
				}
			}

			if (win) {
				if (th.turn) {
					o_win += 1;
				} else {
					x_win += 1;
				}
				continue;
			}

			boolean pass = true;
			

			if (th.othero[0] != th.turn) {
				for (int i = 1; i < th.othero.length; i++) {
					if (th.othero[i] == th.turn) {
						boolean[] tmp = new boolean[th.othero.length + 1];
						System.arraycopy(th.othero, 0, tmp, 1, th.othero.length);
						for (int j = 0; j <= i; j++) {
							tmp[j] = th.turn;
						}
						
						if(!set.contains(hash(tmp, !th.turn))){
							queue.add(new Throw(tmp, !th.turn));
						}
						pass = false;
					}
				}
			}

			if (th.othero[th.othero.length - 1] != th.turn) {
				for (int i = th.othero.length - 2; i >= 0; i--) {
					if (th.othero[i] == th.turn) {
						boolean[] tmp = new boolean[th.othero.length + 1];
						System.arraycopy(th.othero, 0, tmp, 0, th.othero.length);
						for (int j = i; j < tmp.length; j++) {
							tmp[j] = th.turn;
						}

						if(!set.contains(hash(tmp, !th.turn))){
							queue.add(new Throw(tmp, !th.turn));
						}
						pass = false;
					}
				}
			}

			if (pass) {
				queue.add(new Throw(th.othero, !th.turn));
			}
		}

		System.out.println(o_win > x_win ? "o" : "x");
	}

}