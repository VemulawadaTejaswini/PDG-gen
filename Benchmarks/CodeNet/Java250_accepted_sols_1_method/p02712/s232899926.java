import java.io.*;
import java.util.Scanner;

public class Main{

	static long n;
	public static void main(String args[])throws Exception{
		Scanner sc=new Scanner(System.in);
			 n= sc.nextLong();
			 long sum=0;
			for(int i=1;i<=n;i++){
				if(i%3==0 || i%5==0){
					continue;
				}
				else
					sum+=i;
			}
			System.out.print(sum);
		}
	}

