import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N,count = 0;
        N = Integer.parseInt(scan.next());
        count = N;
        int H[] = new int[N];
        for(int i = 0;i < N;i++){
            H[i] = Integer.parseInt(scan.next());
        }

        for(int i = 1;i < N;i++){
            for(int j = 0;j < i;j++){
                if(H[i] < H[j]){
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
            
    }
}