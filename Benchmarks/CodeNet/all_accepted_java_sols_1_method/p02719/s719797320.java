import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
    Long K = sc.nextLong();
    Long ans = N % K;
    if(ans > (K-ans)){
      System.out.println(K-ans);
      return;
    }
    
    System.out.println(ans);
    return;
  }
}
