import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long a = sc.nextLong();
      long b = sc.nextLong();
      long[] list = new long[n];
      for(int i=0;i<n;i++){
        list[i] = sc.nextInt();
      }
      long count = 0;
      for(int i=0;i<n-1;i++){
        if((list[i+1]-list[i])*a < b ){
          count += (list[i+1]-list[i])*a;
        }else{
          count += b;
        }        
      }
      System.out.println(count);
	}
}