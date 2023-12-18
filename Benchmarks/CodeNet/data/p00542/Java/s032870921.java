import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int Points[] = new int[6];
		int sum = 0;
		for(int i = 0 ; i < 6 ; i++){
			Points[i] = scan.nextInt();
		}
		int small = Points[0];
		for(int i = 1 ; i < 4 ; i++){
			if(small > Points[i]){
				small = Points[i];
			}
		}
		for(int i = 0 ; i < 4 ; i++){
			sum += Points[i];
		}
		sum -= small;
		if(Points[4] > Points[5]){
			sum += Points[4];
		}else{
			sum += Points[5];
		}
		System.out.println(sum);
	}
}