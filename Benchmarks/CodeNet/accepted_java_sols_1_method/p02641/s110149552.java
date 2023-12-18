import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int X = inputs.nextInt();
		int N = inputs.nextInt();
		int[] list = new int[N];
		for(int i=0;i<N;i++) {
			list[i] = inputs.nextInt();
		}
		int left=X;
		while(true) {
			boolean huh = true;
			for(int i=0;i<N;i++) {
				if(list[i]==left) {
					huh = false;
				}
			}
			if(!huh) {
				left--;
			}
			else {
				break;
			}
		}
		int right=X;
		while(true) {
			boolean huh = true;
			for(int i=0;i<N;i++) {
				if(list[i]==right) {
					huh = false;
				}
			}
			if(!huh) {
				right++;
			}
			else {
				break;
			}
		}
		if(X-left<=right-X) {
			System.out.println(left);
		}
		else {
			System.out.println(right);
		}
	}

}
