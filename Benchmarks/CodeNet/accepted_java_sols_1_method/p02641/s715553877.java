import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        if(n == 0){
            System.out.println(x);
            return;
        }

        Set p = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            p.add(sc.nextInt());
        }

        if(!p.contains(x)){
            System.out.println(x);
            return;
        }

        for(int i = 1; i <= 100; i++){
            if(!p.contains((x - i))){
                System.out.println((x - i));
                return;
            }
            if(!p.contains((x + i))){
                System.out.println((x + i));
                return;
            }
        }
    }
}