import java.util.*;

public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int L = sc.nextInt();
      String[] str = new String[N];
      for (int i=0;i<N;i++) {
        str[i] = sc.next();
      }
      Arrays.sort(str);
      for(String out : str){
        System.out.print(out);
      }
    }
}