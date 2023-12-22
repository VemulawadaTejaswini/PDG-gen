import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a,b,c,d,amari;
			a = sc.nextInt();
			b = sc.nextInt();
			c = a;
			d = b;
			if(a<b){
				int x = a;
				a=b;
				b=x;
			}	
			while(a%b != 0){
				amari = a % b;
				a = b;
				b = amari;
			}
			int saidaikouyakusuu = b;
		
			int saisyoukoubaisuu = c/saidaikouyakusuu*d;

			System.out.println(saidaikouyakusuu+" "+saisyoukoubaisuu);
		}
	}
}

