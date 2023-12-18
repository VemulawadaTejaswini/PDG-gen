import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        //int n = stdIn.nextInt();
        //int k = stdIn.nextInt();
        //int b = stdIn.nextInt();
        //int num[] = new int[3];
        String s = stdIn.next();
        char c[] = s.toCharArray();
        //boolean flag = true;
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(c[i] == '+'){
                sum++;
            }else{
                sum--;
            }
        }
        
        System.out.println(sum);
        
        
        //System.out.println();
        //System.out.print();
    }
}
