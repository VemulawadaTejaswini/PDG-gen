import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String[] ary = s.split("");
		int[] intAry = new int[4];
		
		for ( int i = 0; i < 4; i++ ) {
			intAry[i] = Integer.parseInt(ary[i]);
		}
		
		String first = String.format("%01d", intAry[0]);
		if ( intAry[0] + intAry[1] + intAry[2] + intAry[3] == 7) {
			System.out.println(first +"+"+ intAry[1] +"+"+ intAry[2] +"+"+ intAry[3] +"=7");
		} else if ( intAry[0] + intAry[1] + intAry[2] - intAry[3] == 7) {
			System.out.println(first +"+"+ intAry[1] +"+"+ intAry[2] +"-"+ intAry[3] +"=7");
		} else if ( intAry[0] + intAry[1] - intAry[2] - intAry[3] == 7) {
			System.out.println(first +"+"+ intAry[1] +"-"+ intAry[2] +"-"+ intAry[3] +"=7");
		} else if ( intAry[0] - intAry[1] - intAry[2] - intAry[3] == 7) {
			System.out.println(first +"-"+ intAry[1] +"-"+ intAry[2] +"-"+ intAry[3] +"=7");
		} else if ( intAry[0] - intAry[1] + intAry[2] + intAry[3] == 7) {
			System.out.println(first +"-"+ intAry[1] +"+"+ intAry[2] +"+"+ intAry[3] +"=7");
		} else if ( intAry[0] - intAry[1] - intAry[2] + intAry[3] == 7) {
			System.out.println(first +"-"+ intAry[1] +"-"+ intAry[2] +"+"+ intAry[3] +"=7");
		} else if ( intAry[0] - intAry[1] + intAry[2] - intAry[3] == 7) {
			System.out.println(first +"-"+ intAry[1] +"+"+ intAry[2] +"-"+ intAry[3] +"=7");
		} else if ( intAry[0] + intAry[1] - intAry[2] + intAry[3] == 7) {
			System.out.println(first +"+"+ intAry[1] +"-"+ intAry[2] +"+"+ intAry[3] +"=7");
		}
		
	}
}