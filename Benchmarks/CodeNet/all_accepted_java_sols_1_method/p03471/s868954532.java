import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    long y=sc.nextLong();
    for(int i=0;i<=n;i++) {
    	for(int j=0;j<=n-i;j++) {
    		if(i*10000+j*5000+(n-i-j)*1000==y) {
    			System.out.println(i+" "+j+" "+(n-(i+j)));
    			System.exit(0);
    		}
    	}
    }
    System.out.println("-1 -1 -1");
  }
}