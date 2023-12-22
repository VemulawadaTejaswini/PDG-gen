
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        
       while(input.hasNextInt()){
            int x1 =input.nextInt();
           int x2 =input.nextInt();
            int x3 = x1+x2;
        String s1 = String.valueOf(x3);
        System.out.println(s1.length());
        }}
    }