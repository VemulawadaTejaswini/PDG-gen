import java.util.*;
class Main{
  	public static void main(String[]args){
      	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      System.out.println(k%2==0&&k>=2*n&&k<=4*n?"Yes":"No");
    }
}