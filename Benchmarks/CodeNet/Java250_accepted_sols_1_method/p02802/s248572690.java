import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
        int m = sc.nextInt();
        int miss = 0, count = 0;
        int tmp;String tmp2;
        int ans[] = new int[n];
        boolean ans2[] = new boolean[n];
        for(int i = 0;i < n;i++){
             ans[i] = 0;
             ans2[i] = false;
        }      
      
      
        for(int i = 0;i < m;i++){
             tmp = sc.nextInt();
             tmp2 = sc.next();
             if(ans2[tmp - 1] == false){
               if(tmp2.equals("AC")){
                 count +=1;
                 ans2[tmp - 1] = true;
                 miss += ans[tmp - 1];
               }else{
                 ans[tmp - 1] += 1;
               }
             }
        }
        System.out.println(count + " " +  miss);
    }
}