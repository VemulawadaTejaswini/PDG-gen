import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int K = sc.nextInt();
    String ans = "No";
    for(int i = 0; i < K; i++) {
    	if(!(A < B)) {
    		B *=2;
    	}
    	else if(!(B < C)) {
    		C *= 2;
    	}
    	if(A < B && B < C) {
    		ans = "Yes";
    		break;
    	}
    }
    
    System.out.println(ans);
    sc.close();
  }
}