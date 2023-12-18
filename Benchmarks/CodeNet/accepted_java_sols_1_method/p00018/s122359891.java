import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> input = new ArrayList<Integer>();
        
        for (int i = 0; i < 5; i++) {
            input.add(scanner.nextInt());
        }
        Collections.sort(input);
        Collections.reverse(input);
        
        for ( int i = 0; i < input.size()-1; i ++) {
            System.out.print(input.get(i) + " ");
        }
        System.out.println(input.get(input.size()-1));
    }    
    
}