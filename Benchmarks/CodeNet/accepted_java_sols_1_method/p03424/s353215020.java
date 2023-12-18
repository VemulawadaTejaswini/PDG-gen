import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();

        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            String s = sc.next();
            set.add(s);
        }

        if(set.size() == 4){
            System.out.println("Four");
        } else {
            System.out.println("Three");
        }
    }
}
