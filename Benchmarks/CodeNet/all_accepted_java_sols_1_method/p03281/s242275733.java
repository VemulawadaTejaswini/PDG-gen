import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 0;
        for(int i = 1; i < n + 1; i += 2){
            int count2 = 1;
            for(int j = n / 2; j > 0; j--){
                if(i % j == 0){
                    count2++;
                }
            }
            if(count2 == 8){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
