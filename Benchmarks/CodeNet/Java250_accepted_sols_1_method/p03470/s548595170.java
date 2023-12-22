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
        int s = n;
        for(int k = 0;k < n - 1;k++){
            if(num[k] == num[k + 1]){
                s = s - 1;
            }
        }
        System.out.println(s);
        sc.close();
    }
}