import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		while(scan.hasNext()){
			int c1 = scan.nextInt();
			int c2 = scan.nextInt();
			int c3 = scan.nextInt();
			double bunbo = 0;
			double bunsi = 0;
			for(int i = 0 ; i < 10 ; i++){
				if(c1 != i+1 && c2 != i+1 && c3 != i+1){
					++bunbo;
					if(c1+c2+i+1 <=20){
						++bunsi;
					}
				}
			}
			if((bunsi/bunbo)*100 >=50){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}