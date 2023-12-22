import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hok;
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i = 1;i <= n; i++){
            num[i-1] = sc.nextInt();
        }
        for(int j = 0; j <= n; j++){
            for(int i = 0; i < n - 1; i++){
                if(num[i] < num[i + 1]){
                    hok = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = hok;
                }
            }
        }
        int a = 0,b = 0,s;
        for(int i = 1;i <= n/2; i++){
        a = a + num[2 * i - 2];
        b = b + num[2 * i - 1];
        }
        if(n % 2 == 1){
            a = a + num[n-1];
        }
        s = a - b;
        if(s < 0){
            s = -s;
        }
        System.out.println(s);
        sc.close();
    }
}