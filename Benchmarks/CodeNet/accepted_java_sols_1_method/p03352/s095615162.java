import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = 1;
		int b = 0;
		int c = 0;
		for(int i=1; i<=31; i++){
			for(int j=2; j<10; j++){
			a = 1;
				for(int k=0; k<j; k++){
					a *= i;
				}
			if(a<=x && a>b)b=a;
			}
		if(c<b)c=b;
		}
		System.out.println(c);
	}
}