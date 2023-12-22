import java.util.*;
public class Main{
	public static void main(String[] args){
          Scanner sc= new Scanner(System.in);
          int n = sc.nextInt();
          int x = sc.nextInt();
          int t = sc.nextInt();
          int time = 0;
          while(n>0){
            n = n-x;
            time += t;
          }
         System.out.println(time);
  	}
}