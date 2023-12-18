import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int i,x;
		i=1;
		Scanner sc;
		do{
			sc = new Scanner(System.in);
			x = sc.nextInt();
			if(x!=0){
				System.out.println("Case "+i+": "+x);
				i++;
			}else{
				break;
			}
		}while(sc != null);
	}
}