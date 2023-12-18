import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int a = 1;
		int b = 0;
		int c = 0;
		while(scan.hasNext()){
			String str = scan.next();
			String[] text = str.split(",", 0);
			if(text[0].equals("A")){
				if(text[1].equals("B")){
					if(a == 1){
						a = 0;
						b = 1;
					}else if(b == 1){
						a = 1;
						b = 0;
					}
				}else if(text[1].equals("C")){
					if(a == 1){
						a = 0;
						c = 1;
					}else if(c == 0){
						a = 1;
						c = 0;
					}
				}
			}else if(text[0].equals("B")){
				if(text[1].equals("A")){
					if(b == 1){
						b = 0;
						a = 1;
					}else if(a == 1){
						b = 1;
						a = 0;
					}
				}else if(text[1].equals("C")){
					if(b == 1){
						b = 0;
						c = 1;
					}else if(c == 0){
						b = 1;
						c = 0;
					}
				}
			}else{
				if(text[1].equals("A")){
					if(c == 1){
						c = 0;
						a = 1;
					}else if(a == 1){
						c = 1;
						a = 0;
					}
				}else if(text[1].equals("B")){
					if(c == 1){
						c = 0;
						b = 1;
					}else if(b == 1){
						c = 1;
						b = 0;
					}
				}
			}
		}
		if(a == 1){
			System.out.println("A");
		}else if(b == 1){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
	}
}