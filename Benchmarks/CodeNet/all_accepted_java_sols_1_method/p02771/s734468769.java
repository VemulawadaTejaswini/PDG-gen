import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C=sc.nextInt();
    
    if(A-B==0&&C-A!=0) System.out.println("Yes");
    else if(A-C==0&&B-A!=0) System.out.println("Yes");
    else if(B-C==0&&C-A!=0) System.out.println("Yes");
    else System.out.println("No");
  }
}