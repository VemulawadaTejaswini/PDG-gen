import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;

        for(int i = 0; i <= a; i++){
            int rest1 = x;
            rest1 = rest1 - 500*i;
            if(rest1 < 0 || rest1 > 100*b + 50*c){
                continue;
            }

            for(int j = 0; j <= b; j++){
                int rest2 = rest1;
                rest2 = rest2 - 100*j;
                if(rest2 < 0 || rest2 > 50*c){
                    continue;
                }

                if(rest2 % 50 == 0 && rest2 / 50 <= c){
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }

}
