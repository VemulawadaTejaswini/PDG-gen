import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for(int i=0; i<N; i++)
      A[i] = sc.nextInt();
    boolean hantei = true;
    
    for(int i=0; i<N; i++){
      if(A[i] % 2 == 1) continue;
      if(A[i] % 3 == 0) continue;
      if(A[i] % 5 == 0) continue;
      hantei = false;
    }
    
    if(hantei == true)
      System.out.println("APPROVED");
    else
      System.out.println("DENIED");
    
  }
}
