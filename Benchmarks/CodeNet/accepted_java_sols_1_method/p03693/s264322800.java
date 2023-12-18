import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int r=Integer.parseInt(sc.next()),g=Integer.parseInt(sc.next()),b=Integer.parseInt(sc.next());
    int f=10*g+b;
    if(f%4==0){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
