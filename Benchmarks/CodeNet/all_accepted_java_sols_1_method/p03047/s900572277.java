import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int numbers = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;

        while(end<=numbers){
            count++;
            end++;
        }

        System.out.println(count);
    }
}