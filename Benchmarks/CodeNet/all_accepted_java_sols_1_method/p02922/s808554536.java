import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner in = new Scanner(System.in);
        int tap = in.nextInt();
        int hole = in.nextInt();
        int sumhole = 1;
        int count = 0;
        while(hole - sumhole > 0){
            sumhole += tap - 1;
            count++;
        }

        System.out.println(count);

    }
}
