import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int num = 0;
            if(n == 0 && x == 0){
                break;
            }
            for(int i = 1; i < n-1; i++){
                for(int j = i+1; j < n; j++ ){
                    for(int k = j+1; k <= n; k++){
                        if(i+j+k == x){
                            num++;
                        }
                    }
                }
            }
            System.out.println(num);
       }
    }
}
