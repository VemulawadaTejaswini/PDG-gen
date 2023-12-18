import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x=sc.nextInt();
    long a=1,b=0,f=(long)(Math.pow(a, 5)-Math.pow(b, 5));
    while(f!=x) {
    	for(long i=-a;i<=a-1;i++) {
    		b=i;
    		f=(long)(Math.pow(a, 5)-Math.pow(b, 5));
    		if(f==x) {
    			System.out.println(a+" "+b);
    			System.exit(0);
    		}
    	}
    	a++;
    }
    System.out.println(a+" "+b);
  }
}
