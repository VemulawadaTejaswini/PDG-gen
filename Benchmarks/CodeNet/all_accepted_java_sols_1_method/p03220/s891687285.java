import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        
        double min = a - (t - (sc.nextInt() * 0.006));
        min = min < 0 ? -1 * min : min;
        int result = 1;
        for(int i = 1; i < n; i++){
            double temp = a - (t - (sc.nextInt() * 0.006));
            temp = temp < 0 ? -1 * temp : temp;
            if(min > temp){
                min = temp;
                result = i + 1;
            }
        }
        
        System.out.println(result);
    }
}
