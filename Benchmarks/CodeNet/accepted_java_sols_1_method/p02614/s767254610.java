import java.util.*;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int k=sc.nextInt();
		char[][] c=new char[h][w];
		
		for(int i=0;i<h;i++) {
			String s=sc.next();
			c[i]=s.toCharArray();
		}
		
		int ans=0;
		for(int i=0;i<(Math.pow(2, h));i++) {
			for(int j=0;j<(Math.pow(2, w));j++) {
				int count=0;
				for(int row=0;row<h;row++) {
					for(int col=0;col<w;col++) {
						if(((i>>row & 1)==1) && ((j>>col & 1)==1)) {
							if (c[row][col] == '#')count++;
							//ystem.out.println(c[row][col]);
						}
					}
				}	
				if(count==k)ans++;
			}
		}
		
	    System.out.println(ans);
	}
}
