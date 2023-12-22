import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		int w = scan.nextInt();
		int n = scan.nextInt();
		String a[] = new String[n];
		int line[][] = new int[n][2];
		for(int i = 0 ; i< n ; i++){
			a[i] = scan.next();
			String mozi[] =  a[i].split(",", 0);
			for(int j = 0 ; j < 2 ; j++){
				line[i][j] = Integer.parseInt(mozi[j]);
			}
		}
		int answer[] = new int[w];
		for(int i = 0 ; i < w ; i++){
			answer[i] = i+1;
			for(int j = 0 ; j < n ; j++){
				if(line[j][0] == answer[i] || line[j][1] == answer[i]){
					if(line[j][0] == answer[i]){
						answer[i] = line[j][1];
					}else{
						answer[i] = line[j][0];
					}
				}
			}
		}
		int goal[] = new int[w];
		for(int i = 0 ; i < w ; i++){
			goal[answer[i]-1] = i+1;
		}
		for(int i = 0 ; i < w ; i++){
			System.out.println(goal[i]);
		}
	}
}