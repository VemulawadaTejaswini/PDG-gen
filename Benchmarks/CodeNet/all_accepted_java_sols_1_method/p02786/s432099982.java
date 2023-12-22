import java.util.*;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        long h = stdIn.nextLong();
        //int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        //c[0] += 1;
        long sum = 0;
        //boolean flag = true;
        int count = 0;
        while(true){
            if(h == 1){
                break;
            }else{
                count++;
                h /= 2;
            }
        }
        
        for(int i = 0; i <= count; i++){
            sum += Math.pow(2, i);
        }
        
        // if(sum >= h){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
        
        System.out.println(sum);
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}