import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int sum = 0;
        for(int i = 0; i < m; i++){
            sum += Integer.parseInt(sc.next());
        }
        
        if(n >= sum){
            System.out.println(n - sum);
        }else{
            System.out.println(-1);
        }
    }
}