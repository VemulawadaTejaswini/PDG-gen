import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        List<Long> name = new ArrayList<>();
        while(n >= 26){
            name.add(n % 26);
            n /= 26;
        }
        name.add(n);
        for(int i=name.size()-1; i>=0; i--){
            System.out.print((char)('a' + name.get(i) - 1));
        }
        System.out.println("");
    }
}