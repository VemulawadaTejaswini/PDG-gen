import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner( System.in);
		int N,A,B;
		int a=0,b=0,c=0;
            N=stdin.nextInt() ;
            A=stdin.nextInt() ;
            B=stdin.nextInt() ;
            
            for(int i=1;i<=N;i++) {
            	int P=stdin.nextInt() ;
            	if(P<=A) {
            		a++;
            	}else if(P<=B){
            		b++;
            	}else {
            		c++;
            	}
            }
            
           
        System.out.println(Math.min(a,Math.min(b, c)));
	}
}
