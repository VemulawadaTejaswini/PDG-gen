import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        String a = sc1.next();
        String b = sc1.next();
        String c = sc1.next();
        
        int count = 0;
        for(int i = 0; i < n; i++){
            Set<String> set = new TreeSet<>();
            set.add(a.substring(i, i + 1));
            set.add(b.substring(i, i + 1));
            set.add(c.substring(i, i + 1));
            count += set.size() - 1;
        }
        System.out.println(count);
    }
}