import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        //int r = stdIn.nextInt();
        //int k = stdIn.nextInt();
        //int b = stdIn.nextInt();
        int num[] = new int[3];
        //String s = stdIn.next();
        //char c[] = s.toCharArray();
        //boolean flag = true;
        
        for(int i = 0; i < 3; i++){
            num[i] = stdIn.nextInt();
        }
        
        Arrays.sort(num);
        
        System.out.println(num[2] - num[0]);
        
        //System.out.println();
        //System.out.print();
    }
}
