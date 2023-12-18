import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
      	int m;
      	int pros[] = new int[n];
      	int sum = 0;
      	int istack;
      	int istack2;
      
      	for(int i = 0;i < n;i++) {
          pros[i] = sc.nextInt();
          sum += pros[i];
        }
        m = sc.nextInt();
          
        for(int i = 0;i < m;i++){
          istack = sc.nextInt() - 1;
          istack2 = sc.nextInt();
          istack2 -= pros[istack];
          System.out.println((sum + istack2));
        }
      
	}
}