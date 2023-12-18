import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = -1;
        
        for(double i = 1;i <= 50000;i++){
            if(Math.floor(i * 1.08) == N){
                res = (int)(Math.floor(i));
                break;
            }
        }
        
        if(res != -1){
            System.out.println(res);
        }else{
            System.out.println(":(");
        }
    }
}
