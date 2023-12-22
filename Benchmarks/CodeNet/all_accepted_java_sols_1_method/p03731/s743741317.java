import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int[] Ti = new int[N];
    int ans = 0;
    for(int i = 0; i < N; i++)
      Ti[i] = sc.nextInt();
      
    for(int i = 0; i < N-1; i++){
      if(Ti[i+1] - Ti[i] <= T){
        ans += Ti[i+1] - Ti[i];
      }else if(Ti[i+1] - Ti[i] > T){
        ans += T;
      }else{
        System.out.println(Ti[i+1] + " " + Ti[i] + "例外発生");
      }
    }
    System.out.println(ans+T);
    
	}
}