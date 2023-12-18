import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = 0;


        for (int a=1;a<=n;a++) {
            int ans = 0;
            sq = (int)Math.sqrt(n) + 1;
            // 配列
            for(int x=1;x<=sq;x++){
                for(int y=1;x+y<=sq;y++){
                    for(int z=1;x+y+z<=sq;z++){
                        if(x*(x+y+z) + y*(y+z) + z*z == a) {
                            ans++;
                        }
                    }
                }
            }
            System.out.println(ans);

        }




    }
}
