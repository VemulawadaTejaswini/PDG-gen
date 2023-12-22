import java.io.*;
import java.util.*;

public class Main {
    
    static int check_three2(int num){
        if (num < 10 && num !=3)return 0;
        int temp = num - (num / 10 * 10);
        if (temp == 3){
            return 1;
        }else{
            return check_three2((num-temp)/10);
        }
    }
    
    
    static int check_three(int num){
        if (num % 3 == 0){
            return 1;
        }else{
            if  (check_three2(num) == 1){
                return 1;
            }
            return 0;
        }
    }    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for (int i = 1; i <= N; i++){
            if (check_three(i) == 1){
                System.out.print(" " + i);
            }
        }
        System.out.println("");
        
    }
}