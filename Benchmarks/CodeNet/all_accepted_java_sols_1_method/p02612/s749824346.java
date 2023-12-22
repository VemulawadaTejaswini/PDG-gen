import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int res=(1000-n%1000)%1000;
      System.out.println(res);
    }
}