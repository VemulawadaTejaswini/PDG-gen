import java.util.HashSet;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        String s;

        HashSet<String> list = new HashSet<String>(N);

        for(int i = 0; i < N; i++){
            s = scanner.next();
            list.add(s);
        }

        System.out.println(list.size());
    }
}