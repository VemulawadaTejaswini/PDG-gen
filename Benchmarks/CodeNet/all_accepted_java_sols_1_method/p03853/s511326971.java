import java.util.*;

public class Main {    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        String str[] = new String[H];
        
        for(int i = 0;i < H;i++){
             str[i] = sc.next();
        }
        
        for(int i = 0;i < H;i++){
            System.out.println(str[i]);
            System.out.println(str[i]);
        }        
        
    }            
}