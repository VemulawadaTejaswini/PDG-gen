import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j,k;
		while(i == 0){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h==0){break;}
			if(w==0){break;}
			for(j=0;j<h;j++){
				for(k=0;k<w;k++){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}