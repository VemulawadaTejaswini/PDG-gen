import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int X=N%10;
    if(X==3) {
    	System.out.println("bon");
    }else {
    	if(X==0||X==1||X==6||X==8) {
    		System.out.println("pon");
    	}else {
    		System.out.println("hon");
    	}
    }
  }
}