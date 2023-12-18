import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        
        int count = 0;
        int[] x = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = Integer.parseInt(s.substring(i, i+1));
        }
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                for(int k = 0; k <= 9; k++){
                    int a = 0;
                    while(a < n){
                        if(x[a] == i){
                            a++;
                            break;
                        }
                        a++;
                    }
                    while(a < n){
                        if(x[a] == j){
                            a++;
                            break;
                        }
                        a++;
                    }
                    while(a < n){
                        if(x[a] == k){
                            count++;
                            break;
                        }
                        a++;
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}