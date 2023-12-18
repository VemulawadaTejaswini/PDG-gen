import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C=sc.nextInt();
    int D=sc.nextInt();
    int K=sc.nextInt();
    int X=(C-A)*60;
    int Y;
    if(B-D>0) {
    	Y=(60-B)+D;
    	System.out.println(X+Y-K-60);
    }else {
    	Y=D-B;
    	System.out.println(X+Y-K);
    	
    }

  }
}