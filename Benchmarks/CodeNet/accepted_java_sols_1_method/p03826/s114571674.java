import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        int a,b,c,d;
        
        Scanner input = new Scanner(System.in);
        
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        
        int area1 = a * b;
        int area2 = c * d;
        
        if(area1 > area2){
            
            System.out.println(area1);
        }else{
            System.out.println(area2);
        }
    }
}
