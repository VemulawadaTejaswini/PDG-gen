import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int a = scan.nextInt();
		int b = scan.nextInt();
		while(a != 0 || b != 0){
			int count = 0;
			for(int i = a ; i <= b ;i++){
				if(i % 100 == 0){
					if(i % 400 == 0){
						System.out.println(i);
						++count;
					}
				}else if(i % 4 == 0){
					System.out.println(i);
					++count;
				}
			}
			if(count == 0){
				System.out.println("NA");
			}
			a = scan.nextInt();
			b = scan.nextInt();
			if(a != 0 || b != 0){
				System.out.println();
			}
		}
	}
}