import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a=s.nextInt();
    if(n<=a){
    	System.out.println("unsafe");
    }else{
    	System.out.println("safe");
    }
  }
}