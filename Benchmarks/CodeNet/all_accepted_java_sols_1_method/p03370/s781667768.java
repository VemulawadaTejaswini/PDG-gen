import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
	  
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int[] m = new int[N];
    int total = N;
    int m_total = 0;
    
    for(int i = 0; i < N; i++){
    	m[i] = sc.nextInt();
    	m_total += m[i];
    }
    Arrays.sort(m);
    total += (X - m_total) / m[0];
    
    System.out.println(total);
  }
}