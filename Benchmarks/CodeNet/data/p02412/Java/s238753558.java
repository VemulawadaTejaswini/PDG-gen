import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n == 0 && x == 0){
                break;
            }
            int count = 0;
            int i, j, k;
            for(i = 1; i <= n; i++){
                for(j = 1; j < i; j++){
                    for(k = 1; k < j; k++){
                        if((i + j + k) == x){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
