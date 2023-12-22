import java.util.*;
 
public class Main {
 
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
        int X = sc.nextInt();
          for (int i = X-(K-1); i <= X+(K-1); i++) {
            if(i>1000000) break;
            if(i<-1000000) continue;
           System.out.print(i + " "); 
          }
	}
}