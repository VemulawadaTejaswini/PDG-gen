import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        char[][] c = new char[H][W];

        for (int i = 0; i < H; i++) {
            c[i] = sc.next().toCharArray();
        }

        int ans = 0;
        for(int h = 0;h< Math.pow(2,H);h++){
            for(int w = 0;w<Math.pow(2,W);w++){
                int count = 0;
                for(int j=0;j<H;j++){
                    for(int k=0;k<W;k++){
                        if((((int)Math.pow(2,j) & h) == 0) && (((int)Math.pow(2,k) & w) == 0) && c[j][k] == '#'){
                            count++;
                        }
                    }
                }
                if(count == K){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

}


