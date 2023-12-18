import java.util.Scanner;

public class Main{
        public static void main(String[] args){
                Scanner s = new Scanner(System.in);
                int[] d = new int[2];
                
                for(int i = 0;i < 2;i++){
                        d[i] = s.nextInt();
                }       
                
                for(int i = 0;i < 2;i++){
                        integral(d[i]);
                }       
        }       
        
        public static void integral(int d){
                int surface = 0;
                for(int i = 0;i < 600;i += d){
                        surface += i*i*d;
                }       
                
                System.out.println(surface);
        }       
} 