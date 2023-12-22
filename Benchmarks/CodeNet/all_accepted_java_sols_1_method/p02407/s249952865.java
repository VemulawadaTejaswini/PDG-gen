import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		int n =scane.nextInt();

		int[] a = new int[n];

		for(int i =0; i <n; i++){
			a[i] = scane.nextInt();
		}

		for(int i =a.length-1; i>=0; --i){
			if(i !=0){
			System.out.print(a[i]+" ");
			}else{
				System.out.println(a[i]);
			}
		}

	}
}