import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C=sc.nextInt();
    int D=sc.nextInt();
    
    int X=(A-1)/D;
    int Y=(C-1)/B;
    
    if(Y>X) {
    	System.out.println("No");
    }else {
    	System.out.println("Yes");
    }
  }
    }