import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();

        int count = 0;
        int maxR = N/R;
        for (int i=0;i<=maxR;i++){
            int restN = N-i*R;
            int maxG = restN/G;
            for(int j=0;j<=maxG;j++){
                int tmp = restN - j*G;
                if(tmp%B==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}