import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Y = in.nextInt()/1000;
        int[] C = {10,5,1};
        int[] used = {-1,-1,-1};

        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= N-i; j++){
                for(int k = 0; k <= N-i-j; k++){
                    if(i+j+k == N && C[0]*i+C[1]*j+ C[2]*k == Y){
                        used[0] = i;
                        used[1] = j;
                        used[2] = k;
                        break;
                        
                    }
                }
            }
        }
        for(int i = 0; i < 3; i++){
            System.out.print(used[i]+" ");
        }
        in.close();
    }
}
