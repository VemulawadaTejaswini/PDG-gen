import java.util.Scanner;

public class Main {

    public static  void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x[] = new int[3];
        for(int i = 0; i < 3; i++){
            x[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int max = 0;
        int max_val = 0;
        for(int i = 0; i < 3; i++){
            if(max_val < x[i]){
                max_val = x[i];
                max = i;
            }
        }
        for(int i = 0; i < k; i++){
            max_val += max_val;
        }
        int ans = 0;
        for(int i = 0; i < 3; i++){
            if(i != max){
                ans += x[i];
            }
        }
        System.out.println(ans + max_val);
    }
}
