import java.io.*;
import java.util.Scanner;

public class Chessboard{
	public static void main(String[] args){
		int i=0;
		int j=0;
		int k;
		int l=0;
		Scanner sc = new Scanner(System.in);
		
		while(l==0){
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			if(h==0){
				if(w==0){
					break;
				}
			}		
		
			while(i<h){
				while(j<w){
					k=i+j;
					if(k%2==0){
						System.out.print("#");
					}else{
						System.out.print(".");
					}
					j++;
				}
				System.out.println();
				j=0;
				i++;
			}
			i=0;
			j=0;
		}
	}
}