import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		// 整数の入力
        
        int x = sc.nextInt();
        
        int scnum = sc.nextInt();
        if(scnum == 0) System.out.println(x);System.exit(0);

        int[] p = new int[scnum];

        for(int i = 0;i < scnum;i++){
            p[i] = sc.nextInt();
        }

        Arrays.sort(p);

        int min = 200;
        int ans = -1; 
        int j = 0;
        for(int i = 0;i < 102;i++){
            if(i == p[j]){
                if(j < scnum){
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