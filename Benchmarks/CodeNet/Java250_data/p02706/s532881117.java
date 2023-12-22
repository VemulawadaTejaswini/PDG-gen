import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    int X[];
    X=new int[M];
    int total=0;
    for (int i=0; i<X.length; i++) {
    	X[i]=sc.nextInt();
    	total += X[i];
    }
    int Y=N-total;
    if(Y>=0) {
    	System.out.println(Y);
    }else {
    	System.out.println("-1");
    }
  }
}