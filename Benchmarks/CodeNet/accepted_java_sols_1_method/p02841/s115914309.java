import java.util.*;

public class Main{
  public static void main(String[] args){
	Scanner s=new Scanner (System.in);
    int m1 = s.nextInt();
    int d1 =s.nextInt();
    int m2 = s.nextInt();
    int d2 =s.nextInt();
    if(d2>d1){
    	System.out.println(0);
    }else{
    	System.out.println(1);
    }
  }
}