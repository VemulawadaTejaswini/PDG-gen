import java.util.Scanner;
import java.util.HashSet;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    HashSet<Long> set = new HashSet<Long>();
    boolean hantei = true;
    
    for(int i=0; i<N; i++){
      int bSize = set.size();
      Long A = sc.nextLong();
      if(set.contains(A) == true){
        hantei = false;
        break;
      } else set.add(A);
    }
    if(hantei == true) System.out.println("YES");
    else System.out.println("NO");
  }
}
