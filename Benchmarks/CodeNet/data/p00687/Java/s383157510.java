import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) throws IOException{
		Scanner bf = new Scanner(System.in);
		while(true){
			int n = bf.nextInt();
			int a = bf.nextInt();
			int b = bf.nextInt();
			if(n == 0 && a == 0 && b == 0) break;
			int[] list = new int[n+1];
			for(int i=0; i<n+1; i++) list[i] = 0;
			list[0] = 1;
			int counter = 0;
			for(int i=0; i<n+1; i++){
				if(list[i] == 1){
					if(i+a < n+1) list[i+a] = 1;
					if(i+b < n+1) list[i+b] = 1;
				}else counter++;
			}
			System.out.println(counter);
		}
	}
}