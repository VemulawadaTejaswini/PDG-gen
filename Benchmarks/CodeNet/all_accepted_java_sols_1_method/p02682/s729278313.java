import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
      int total = 0;
        if(a<=k){
         total += a;
      }else{
         total += k;
      }
      k = k-a-b;
      if(c<=k){
         total -=c;
      }else{
         if(k>0){
            total -= k;
         }else{
         }
      }
      System.out.println(total);
	}
}

    