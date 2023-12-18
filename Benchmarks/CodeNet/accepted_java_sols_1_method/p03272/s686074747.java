import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      
      int n=sc.nextInt();//何両編成か
      int i=sc.nextInt();//前から何両目か
      int b=0;//後ろから何両目か
      
      b=(n-i)+1;
      
      System.out.println(b);
    }
}