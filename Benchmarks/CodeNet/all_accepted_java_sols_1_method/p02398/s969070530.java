import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();
      int sum = 0;
      for(int i = a;i <= b;i++){
        int q = c % i;
        if(q == 0){
          sum++;
        }
        if(i == b){
          System.out.println(sum);
        }
      }
     }
    }

