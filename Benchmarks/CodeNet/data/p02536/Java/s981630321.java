import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
        int M = sc.nextInt();
      	int Road[] = new int[N];
      	int i = 0;
      	int total = 0;
      	for(i = 0;i < M * 2;i++){
		  Road[sc.nextInt()-1] += 1;
        }
      	for(i = 0;i < N; i++){
          total += Road[i];
        }
        System.out.println(total-M);
    }
}
