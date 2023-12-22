import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int count = 0;
        for(int i = n; i > 0; i--){
            if(i - k >= 0){
                count++;
            }
        }
        
        System.out.println(count);
    }
    
}