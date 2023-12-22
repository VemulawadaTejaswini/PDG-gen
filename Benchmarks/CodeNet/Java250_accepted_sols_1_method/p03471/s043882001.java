import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        //Nはお札の枚数
        int N = stdIn.nextInt();
        //合計金額
        int Y = stdIn.nextInt();

        for (int i=0; i<=N; i++) {
            for (int j=0; j<=N-i; j++) {
                int k = N - i - j;
                int totil = i * 10000 + j * 5000 + k * 1000;
                if (totil == Y) {
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
    }
}