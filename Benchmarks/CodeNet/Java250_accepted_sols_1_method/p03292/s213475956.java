import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] As = new int[3];
        As[0] = scanner.nextInt();
        As[1] = scanner.nextInt();
        As[2] = scanner.nextInt();

        int bestCost = 99999;
        for(int i = 0; i < 3;i++){

            for(int j = 0; j < 3;j++){
                if(j == i) continue;
                int sum = 3 - i - j;
                int a = Math.abs(As[j] - As[i]);
                a+=  Math.abs(As[sum] - As[j]);
                if(a < bestCost){
                    bestCost = a;
                }
            }

        }
        System.out.println(bestCost);
    }
}