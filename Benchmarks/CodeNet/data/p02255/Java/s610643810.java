import java.io.*;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		Integer num = Integer.parseInt(s.nextLine());
		Integer[] seq = new Integer[num];
		Integer index = 0;
		while(s.hasNext()){
			String input = s.next();
			if(!input.equals("")){
				seq[index] = Integer.parseInt(input);
			}
			index++;
		}
		s.close();
		for(int j = 1;j < seq.length; j++){
			print_seq(seq);
			Integer key = seq[j];
			Integer i = j - 1;
			while(i >= 0 && seq[i] > key){
				Integer bkp = seq[i+1];
				seq[i+1] = seq[i];
				seq[i] = bkp;
				i -= 1;
			}
		}
		print_seq(seq);
	}

	private static void print_seq(Integer[] seq){
		for(int i = 0; i < seq.length; i++){
			if(i == seq.length - 1){
				System.out.print(seq[i]);
			}
			else{
				System.out.print(seq[i] + " ");
			}
		}
		System.out.print("\n");
	}
}