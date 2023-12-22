import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = new String[2];
        try{
            num = br.readLine().split(" ");
        }catch(Exception e){

        }
        int k = Integer.valueOf(num[0]);
        int x = Integer.valueOf(num[1]);
        int max = x + k;
        for(int i = x - k + 1;i<max;i++){
            System.out.print(i);
            if(i != max - 1){
                System.out.print(" ");
            }
        }
    }
}