import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      ArrayList<Integer> list = new ArrayList<>();
      if(n==0){
        System.out.println(0);
      	return;
      }
      while(n!=0){
      	int b = Math.abs(n%2);
        list.add(b);
        n = (n-b)/(-2);
      }
      Collections.reverse(list);
      for(int x : list)System.out.print(x);
      System.out.println("");
    }
}