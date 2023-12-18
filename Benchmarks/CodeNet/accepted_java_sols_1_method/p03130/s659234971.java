import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int tmp;
        int town[] = {0, 0, 0, 0};
        for(int i = 0;i < 6;i++){
          tmp = sc.nextInt();
          town[tmp -1] += 1;
          if(town[tmp -1] == 3){
            System.out.println("NO");
            return;
          }
        }
		System.out.println("YES");
        
    }
}