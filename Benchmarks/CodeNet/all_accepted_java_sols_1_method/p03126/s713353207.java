import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        int[] love = new int[m];
        int k, a;
        for(int i = 0; i < n; i++){
            k = Integer.parseInt(sc.next());
            for(int j = 0; j < k; j++){
                a = Integer.parseInt(sc.next());
                love[a-1]++;
            }
        }
        
        int count = 0;
        for(int i = 0; i < m; i++){
            if(love[i] == n){
                count++;
            }
        }
        
        System.out.println(count);
    }
}