import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		// 整数の入力
        
        int x = sc.nextInt();
        
        int scnum = sc.nextInt();
        

        int[] p = new int[scnum];

        for(int i = 0;i < scnum;i++){
            p[i] = sc.nextInt();
        }

        Arrays.sort(p);

        int min = 200;
        int ans = -1; 
        int j = 0;
        for(int i = 0;i < 101;i++){
            if(i == p[j]){
                if(i < scnum - 1){
                    j++;
                }
            }else if(Math.abs(i - x) < min){
                ans = i;
                min = Math.abs(i - x);
            }
        }
		// 出力
		System.out.println(ans);

    }
}