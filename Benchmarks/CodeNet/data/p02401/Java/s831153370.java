import java.io.*;
import java.util.Scanner;



public class Main {
    public static void main(String[] args)throws IOException{
     for(int i = 0;i >= 0;i++){
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = scan.nextInt();
        String op = br.readLine();
        int b = scan.nextInt();
        if(op.equals("+")){
            int S = a + b;
        }else if(op.equals("-")){
            int S = a - b;
        }else if(op.equals("*")){
            int S = a * b;
        }else if(op.equals("/")){
            int S = a / b;
        }else{
            i = -1;
        }
       }
     }
    }


