import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
 
      int N = sc.nextInt();
      int D = sc.nextInt();
      int C = 0;
      for(int i=0;i<N;i++){
      	int X = sc.nextInt();
        int Y = sc.nextInt();
        if(((X*X)+(Y*Y))<=D*D){
        	C++;
        }
      }
      
	System.out.println(C);
      
    }
}