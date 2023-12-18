import java.util.Scanner;
import java.util.Stack;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int N = cin.nextInt();
			int[] a = {1024,512,256,128,64,32,16,8,4,2,1};
			boolean first = true;
			Stack<Integer> s = new Stack<Integer>();
			for(int i = 0; i < a.length; i++){
				if(N >= a[i]){


					s.push(a[i]);
					N -= a[i];
				}
			}
			while(!s.isEmpty()){
				if(!first){
					System.out.print(" " );
				}
				first=false;
				System.out.print(s.pop());
			}
			System.out.println();
		}

	}

}