import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        //int n = stdIn.nextInt();
        //int a = stdIn.nextInt();
        //int b = stdIn.nextInt();
        //int c = stdIn.nextInt();
        String s = stdIn.next();
        char c[] = s.toCharArray();
        //String ss[] = new int[s.length()];
        
        boolean flag = true;
        
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                if(c[i] == 'L'){
                    flag = false;
                    break;
                }
            }else{
                if(c[i] == 'R'){
                    flag = false;
                    break;
                }
            }
        }
        
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
        // if(s.equals("Sunny")){
        //     System.out.println("Cloudy");
        // }else if(s.equals("Cloudy")){
        //     System.out.println("Rainy");
        // }else{
        //     System.out.println("Sunny");
        // }
        
        //int count = 0;
        
        //for(int i = 0; i < s.length(); i++){
            //ss[i] = c
        //}
        
        //System.out.println();
    }
    
}
