import java.io.*;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		//try{
			for(int i=0;i<200;i++){
				Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				int b = sc.nextInt();
				//System.out.printf("%d %d\n",a,b);
				int c = a+b;
				for(int j = 0;j<14;j++){
						c -= Math.pow(10,j);
						if(c<=0){
							System.out.printf("%d\n",j);
							break;
						}
				}
			}
		//}
	}
}