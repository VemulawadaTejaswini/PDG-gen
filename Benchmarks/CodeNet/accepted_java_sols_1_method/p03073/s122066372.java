import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N,count = 0,color;
        String S;
        S = scan.next();
        N = String.valueOf(S).length();
        color = Integer.parseInt(S.substring(0,1));

        for(int i= 1;i < N; i++){
            if(Integer.parseInt(S.substring(i,i+1)) == color){
                count++;
            }
            if(color == 0){
                color = 1;
            }else{
                color = 0;
            }
        }
        System.out.println(count);
    }
}