import static java.lang.System.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] ar = new int[n];
    int count = 0;
    int a = 0;
		for (int i=0; i<n; i++) {
			ar[i] = sc.nextInt();
		}
    for(int i=0; i<n; i++){
      a = ar[i];
      if(a % 2 == 0){
        while(true){
          a = a / 2;
          count = count + 1;
          if(a % 2 != 0){
            break;
          }
        }
      }
    }
    System.out.println(count);
  }
}