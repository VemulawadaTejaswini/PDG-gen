import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] n = str.split("");
        int sum = 0;
        
        ListIterator<String> iterator = Arrays.asList(n).listIterator();
        
        while(iterator.hasNext()){
            sum += Integer.parseInt(iterator.next());
        }
        
        int num = Integer.parseInt(str);
        if(num % sum == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
