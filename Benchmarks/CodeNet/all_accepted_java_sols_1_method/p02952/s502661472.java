import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int count = 0;
        
        for(int i = 1; i <= n; i++){
           int j = String.valueOf(i).length();
           if(j % 2 == 1){
               count++;
           }
        }
        System.out.println(count);
    }
}
