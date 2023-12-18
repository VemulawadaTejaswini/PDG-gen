
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d[] = new int[N];
        int i;
        for (i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }

        boolean yes = true;
        int kyori = 0;
        int ima = 0;

        for (i = 0; i < N; i++) {
            kyori = i * 10;

            if (ima < kyori) {
                //ここで飛距離とトランポリンの場所を求めてkyoriよりimaが下だったときyesをfalseにして計算を終わる

                yes = false;
                //kyoriはトランポリンのある場所。飛距離は場所とトランポリンの合計

            }
            int hikyori = kyori + d[i];
            if (hikyori > ima) {
                ima = hikyori;
            }
        }
            ima = 0;
            for (i = 0; i < N; i++) {
                kyori = i * 10;

                if (ima < kyori) {
                    yes = false;
                }
               int  hikyori = kyori + d[N-1-i];
                
                
                if (hikyori > ima) {
                    ima = hikyori;
                }
            }
            if (yes) {
                System.out.println("yes");

            } else {
                System.out.println("no");

            }
        

    }
}

