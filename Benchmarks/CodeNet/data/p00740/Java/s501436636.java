import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        solve1159();
    }

    public static void solve1159() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            if (n == 0 && p == 0) {
                break;
            }
            int[] kouhosya = new int[n];
            for(int i = 0; i < n; i++){
                kouhosya[i] = 0;
            }
            int wan = p;
            int index = 0;

            while(true){
                if(wan > 0){
                    kouhosya[index % n]++;
                    wan--;
                    if(kouhosya[index % n] == p){
                        break;
                    }
                } else {
                    wan += kouhosya[index % n];
                    kouhosya[index % n] = 0;
                }
                index++;
            }
            System.out.println(index % n);
        }
    }
}