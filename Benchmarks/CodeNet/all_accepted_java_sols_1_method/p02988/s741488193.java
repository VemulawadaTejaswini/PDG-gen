import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int count = 0;
        int num[] = new int[n];
        
        for(int i = 0; i < n; i++){
            num[i] = stdIn.nextInt();
        }
        
        for(int i = 1; i < n - 1; i++){
            if(num[i - 1] > num[i]){
                if(num[i] > num[i + 1]){
                    count++;
                }
            }else{
                if(num[i] < num[i + 1]){
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
