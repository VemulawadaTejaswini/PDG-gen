import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        //int a = stdIn.nextInt();
        //int b = stdIn.nextInt();
        //String s = stdIn.next();
        //int size[] = new int[n];
        //int sum = 0;
        //char c[] = s.toCharArray();
        
        //for(int i = 0; i < n; i++){
            //size[i] = stdIn.nextInt();
        //}
        
        if(n % 2 == 0){
            System.out.println(n / 2 - 1);
        }else{
            System.out.println(n / 2);
        }
    }
}
