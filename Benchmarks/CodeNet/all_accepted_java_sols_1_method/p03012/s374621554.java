import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];
        int total = 0;
        int count = 0;
        int min = n + 1;
        for(int i = 0; i < n; i++){
            numbers[i] = Integer.parseInt(sc.next());
            total += numbers[i];
        }
        for(int i = 0 ; i < n; i++){
            count += numbers[i];
            int temp = Math.abs(total - (count * 2) );
            if(temp < min) min = temp;
        }
        System.out.println(min);
        
    }
    
}