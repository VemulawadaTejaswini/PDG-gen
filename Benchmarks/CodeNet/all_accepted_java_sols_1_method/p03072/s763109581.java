import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N =sc.nextInt();
      
      int h[] =new int[N];
      for(int i=0; i<N; i++){
      h[i] =sc.nextInt();
      }
      int a=0;
      for(int i=0; i<N; i++){
      if(h[0]<=h[i]){
      h[0]=h[i];
        a++;
      }
      }
      System.out.println(a);
    }
}