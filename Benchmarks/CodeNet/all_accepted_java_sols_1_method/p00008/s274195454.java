import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
					
			int a;
			int b;
			int c;
			int d;
			int count=0;
			
			for(int i=9;i>=0;i--){
				a = i;
				for(int j=9;j>=0;j--){
					b = j;
					for(int k=9;k>=0;k--){
						c = k;
						for(int l=9;l>=0;l--){
							d = l;
							if(a+b+c+d==n && a <10 && b <10 && c <10 && d <10){
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}