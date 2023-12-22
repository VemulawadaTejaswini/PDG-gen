import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int[][] arr = new int[3][];
        for(int i = 0; i < 3; i++) arr[i] = new int[3];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) arr[i][j] = scan.nextInt();
        }
        
        int[] diff = new int[9];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) diff[i*3+j] = arr[i][j] - arr[i][(j+1)%3];
        }
        
        for(int i = 0; i < 3; i++){
            if(diff[i] != diff[i+3] || diff[i+3] != diff[i+6]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
