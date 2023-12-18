import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		int n = scan.nextInt();
		int kazu[][] = new int[n*2][4];
		for(int i = 0 ;i < n*2 ; i++){
			kazu[i][0] = i+1;
		}
		int m = scan.nextInt();
		int k;
		int bunki[][] = new int[2][n/2-1];
		for(int i = 0 ; i < m ; i++){
			k = scan.nextInt();
			if(k == 0){
				for(int j = 0 ; j < n ; j++){
					kazu[j][2] = kazu[j][0];
					kazu[j][3] = kazu[n+j][0];
				}
				for(int j = 0; j < n*2 ; j+=2){
					kazu[j][1] = kazu[j/2][2];
					kazu[j+1][1] = kazu[j/2][3];
				}
				for(int j = 0 ; j < n*2 ; j+=2){
					kazu[j][0] = kazu[j][1];
					kazu[j+1][0] = kazu[j+1][1];
				}
			}else{
				for(int j = 0 ; j < n*2-k ; j++){
					kazu[j][1] = kazu[k+j][0];
				}
				for(int j = 0 ; j < k ; j++){
					kazu[2*n-k+j][1] = kazu[j][0];
				}
				for(int j = 0 ; j < n*2 ; j+=2){
					kazu[j][0] = kazu[j][1];
					kazu[j+1][0] = kazu[j+1][1];
				}
			}
		}
		for(int i = 0 ; i < n*2 ; i++){
			System.out.println(kazu[i][0]);
		}
	}
}