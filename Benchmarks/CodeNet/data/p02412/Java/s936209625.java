import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n == 0 && x ==0) break;
            int num[] = new int[400];
            for(int l = 0; l < 400; l++) {
                num[l] = 0;
            }

            for(int i = n; i > 2; i--){
                for(int j = i - 1; j > 1; j--){
                    for(int k = j - 1; k > 0; k--){
                        num[i+j+k] += 1;
                    }
                }
            }
            System.out.println(num[x]);
        }
    }
}
