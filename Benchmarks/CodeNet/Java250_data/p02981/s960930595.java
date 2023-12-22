import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();
        int train = sc.nextInt();
        int cab = sc.nextInt();
        
        if (persons * train > cab) {
            System.out.println(cab);
        } else {
            System.out.println(persons * train);
        }
    }
}