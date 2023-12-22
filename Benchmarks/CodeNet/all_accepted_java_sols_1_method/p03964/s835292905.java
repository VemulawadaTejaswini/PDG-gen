import java.util.Scanner;
import java.lang.String;
 
public class Main {
  
  public static void main (String[] arg) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long Takahashi = sc.nextLong();
    long Aoki = sc.nextLong();
    
    for (int i = 1; i < N; i++) {
    	long Ti = sc.nextLong();
    	long Ai = sc.nextLong();
    	long mulFactor = ((Takahashi - 1 + Ti)/Ti > (Aoki - 1 + Ai)/Ai) ? (Takahashi - 1 + Ti)/Ti : (Aoki - 1 + Ai)/Ai;
    	
    	Takahashi = Ti * mulFactor;
    	Aoki = Ai * mulFactor;
    }
    
    sc.close();
    System.out.println(Takahashi + Aoki);
  }
}