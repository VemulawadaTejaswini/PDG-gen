import java.io.*;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i=1;
		int s;
		int[] data = new int[10000];
		while(true){
			s = scan.nextInt();
			if(s == 0){
				break;
			}
			else{
				data[i-1] = s;
			}
			i++;
		}
		for(int j=1; j<i; j++){
			System.out.println("Case " + j + ": " + data[j-1]);
		}
	}
}
