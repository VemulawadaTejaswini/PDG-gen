import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int a = sc.nextInt();
        int color[] = {0, 0, 0, 0, 0, 0, 0, 0,0};
        int ans = 0,ans2 = 0,tmp;
        for(int i = 0;i < a;i++){
          tmp = sc.nextInt();
          if(tmp / 400 >= 8){
            color[8] += 1;
          }else{
            color[tmp  / 400] = 1;
          }
        }
        
        for(int i = 0; i < 8;i++){
          ans += color[i];
        }
        ans2 = ans + color[8];
        if(ans == 0){
          ans = 1;
        }
      
        System.out.println(ans + " " + ans2);
    }
}