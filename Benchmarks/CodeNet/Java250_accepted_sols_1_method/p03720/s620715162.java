import java.util.*;
public class Main {
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
      	//N個の都市
		int N = sc.nextInt();
      	//M本の道路
        int M = sc.nextInt();
      	//数字の組み合わせ入力
      	int Road[] = new int[N];
      	for(int i = 0;i < M * 2;i++){
		  Road[sc.nextInt()-1] += 1;
        }
      	for(int i = 0;i < N; i++){
          System.out.println(Road[i]); 
        }
    }
}