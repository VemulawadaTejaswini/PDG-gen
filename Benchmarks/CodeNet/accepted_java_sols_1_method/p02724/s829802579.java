import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int X=sc.nextInt();
      int happy=0;
      happy+=X/500*1000;
      happy+=X%500/5*5;
      System.out.println(happy);
   }
}

