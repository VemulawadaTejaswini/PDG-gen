import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        sc.next();
        sc.next();
        sc.next();
        int e = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        if(e-a > k){
            System.out.println(":(");
        }else{
            System.out.println("Yay!");
        }
    }
}