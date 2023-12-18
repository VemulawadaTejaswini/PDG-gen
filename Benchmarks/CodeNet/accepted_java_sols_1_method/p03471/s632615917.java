import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        int a = -1;
        int b = -1;
        int c = -1;
        boolean breakFlag = false;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n-i; j++){
                int sum = 10000*i + 5000*j + 1000*(n-i-j);
                if(sum == y){
                    a = i;
                    b = j;
                    c = n - i - j;
                    breakFlag = true;
                }
            }
            if(breakFlag){
                break;
            }
        }
        System.out.println(String.valueOf(a) + " " + String.valueOf(b) + " " + String.valueOf(c));
        sc.close();
    }

}
