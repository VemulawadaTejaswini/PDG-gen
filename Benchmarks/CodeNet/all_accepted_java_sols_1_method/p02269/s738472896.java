import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hash = new HashSet<String>();
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            String op = scanner.next();
            String word = scanner.next();
            if(op.equals("insert"))
                hash.add(word);
            else if(op.equals("find")){
                if(hash.contains(word))
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }
    }
}

