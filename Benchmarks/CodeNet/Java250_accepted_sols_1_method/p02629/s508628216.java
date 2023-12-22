import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        
        List<Character> list = new ArrayList<Character>();
        int i = 0;
        
        while (n != 0) {
            list.add((char) ((n - 1) % 26 + 'a'));
            n = (n - 1) / 26;
        }
        
        Collections.reverse(list);
        
        for(char c : list){
            System.out.print(c);
        }
    }
}