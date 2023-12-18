import java.util.*;

public class Aoj10011_join {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.nextLine();
        List<String> a = Arrays.asList(input.nextLine().split(" "));
        Collections.reverse(a);
        System.out.println(String.join(" ", a));
    }
}