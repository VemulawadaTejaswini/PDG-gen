import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int A,B,sum = 0;

        A = Integer.parseInt(scan.next());
        B = Integer.parseInt(scan.next());
        
        for(int i = 0;i < 2;i++){
            if(A > B){
                sum += A;
                A--;
            }else{
                sum += B;
                B--;
            }
        }
        System.out.println(sum);
            
    }
}