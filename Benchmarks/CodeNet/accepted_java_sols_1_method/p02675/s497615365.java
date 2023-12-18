import java.util.*;

class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int rem = n % 10;
        
        if(rem == 2 || rem == 4 || rem == 5 || rem == 7 || rem == 9)
            System.out.println("hon");
        else if(rem == 3)
            System.out.println("bon");
        else
            System.out.println("pon");
    }
}