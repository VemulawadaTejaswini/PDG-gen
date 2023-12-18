import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ans=0;

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();

        top:for(int i = 0;i<=a;i++){
            if(i*500>x) break;
            second:for(int i1 = 0;i1<=b;i1++){
                if((i*500+i1*100)>x) continue top;
                for(int i2 = 0;i2<=c;i2++){
                    int tmp = i * 500 + i1 * 100 + i2 * 50;
                    if(tmp ==x) {
                        ans++;
                        continue second;
                    }
                    if(tmp >x){
                        continue second;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
