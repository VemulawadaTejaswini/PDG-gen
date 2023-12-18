
import java.awt.Color;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//???
		int b = sc.nextInt();//???
		String c[] = new String[a];
		for(int i=0;i<a;i++){c[i] = sc.next();}//?????? ??£??\
		for(int i=0;i<a;i++){
			int t = -1;
			for(int j=0;j<b;j++){
				if(j != 0){System.out.print(" ");}
				if(c[i].charAt(j) == 'c'){	
					t = 0;
					System.out.print(t);
					}
				else if(t != -1){t = t+1;System.out.print(t);}
					else{System.out.print(t);}
			}
			System.out.println();
		}
	}
}