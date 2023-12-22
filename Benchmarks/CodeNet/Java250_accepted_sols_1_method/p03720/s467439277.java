import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int m = sc.nextInt();
      	int[] C = new int[n];
      	for(int i = 1; i <= m ; i++){
      		int a = sc.nextInt();
      		int b = sc.nextInt();
          	C[a-1]++;
          	C[b-1]++;
        }
      	for(int x : C){
          	System.out.println(x);
        }
	}
}
