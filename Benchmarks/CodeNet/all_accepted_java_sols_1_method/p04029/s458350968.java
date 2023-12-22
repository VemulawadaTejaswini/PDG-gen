import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int can = 0;
        int a = read.nextInt();
        for (int i=1; i <= a ; i++)
            can = can + i;
        
        System.out.println(can);
    }
    
}