import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){

		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int T[] = new int[n];
		int sumT = 0;

		for(int i = 0;i < n;i++){
			T[i] = stdIn.nextInt();
			sumT += T[i];
		}

		int border = 0;

		int i = 0;
		while(border < sumT / 2){
			border += T[i++];
		}
		
		if(Math.abs(border - sumT / 2) > Math.abs(border - T[i - 1] - sumT / 2)){
			border -= T[i - 1];
		}
		int ans = Math.abs(border * 2 - sumT); 
		System.out.println(ans);
  
	}
}