import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //N：枚数
        int Y = sc.nextInt(); //Y：宣言された金額

        int sum;//合計金額
        for(int i=0;i<=N;i++){
            for(int j=0;j<=N-i;j++){
                for(int k=0;k<=N-i-j;k++){
                    sum = i*10000+j*5000+k*1000;
                    if(sum == Y){
                        if(i+j+k == N){
                        System.out.println(i+" "+j+" "+k);
                        return;
                        }
                    }
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}