import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int X = in.nextInt();
        int sum =0;
        int count = 0;
        for(int i = 0; i <= A; i++){
            sum = 0;    
            for(int j = 0; j <= B; j++){
                for(int k = 0; k <= C; k++){
                    sum =500*i+100*j+ 50*k;
                    if(sum > X){
                        break;
                    } else if (sum == X){
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }

}