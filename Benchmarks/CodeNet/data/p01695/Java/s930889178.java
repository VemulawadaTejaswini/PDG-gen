import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			calc(n);
		}
	}
	public void calc(int n){
		int[][] dots = new int[n][1000+1];
		String[] words = new String[n];
		int max = 0;
		
		for(int i = 0; i < n; i++){
			String s = sc.next();
			if(s.length() > max) max = s.length();
			
			int before = -1;
			int mmax = 0;
			for(int k = 0; k < s.length(); k++){
				String t = s.substring(k, k+1);
				if(t.equals(".")){
					before = 0;
				}
				else {
					if(before == 0){
						dots[i][k-1] = 1;
					}
					dots[i][k] = -1;
					break;
				}
				mmax++;
			}
			words[i] = s.substring(mmax);
			if(mmax > max) max = mmax;
		}
		
		for(int k = 0; k < max+1; k++){
			int start = -1;
			for(int i = 0; i < n; i++){
				if(dots[i][k] == 1){
					if(start == -1){
						start = i+1;
					}
					else{
						for(int j = start; j < i; j++){
							dots[j][k] = 2;
						}
						start = -1;
					}
				}
				else if(dots[i][k] == -1 || dots[i][k] == 2){
					start = -1;
				}
			}
		}
		
		for(int i = 0; i < n; i++){
			for(int k = 0; k < 1000+1; k++){
				if(dots[i][k] == 0) {
					System.out.print(" ");
				}
				else if(dots[i][k] == 1){
					System.out.print("+");
				}
				else if(dots[i][k] == 2){
					System.out.print("|");
				}
				else{
					System.out.println(words[i]);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}