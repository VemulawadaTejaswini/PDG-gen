import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(true){
			try{
				int m=scan.nextInt();
				int f=scan.nextInt();
				int r=scan.nextInt();
				String score;
				if(m+f+r==-3){
					break;
				}
				if(m==-1 || f==-1 || m+f<30){
					score="F";
				}
				else{
					if(80<=m+f){
						score="A";
					}else if(65<=m+f){
						score="B";
					}else if(m+f<50 && r<50){
						score="D";
					}else{
						score="C";
					}
				}
				System.out.println(score);
			}catch(NumberFormatException e){
				break;
			}
		}
	}
}