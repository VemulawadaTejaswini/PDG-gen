import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        
        int x = (Math.max(Math.max(a, b), c) *3) - (a+b+c);
        if(x%2 == 0){
            System.out.println(x/2);
        }else{
            System.out.println(x/2 +2);
        }
    }
}