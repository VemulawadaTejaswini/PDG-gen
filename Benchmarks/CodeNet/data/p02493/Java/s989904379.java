import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.nextLine();
        List<String> l = Arrays.asList(input.nextLine().split(" "));
        Collections.reverse(l);
        System.out.println(String.join(" ", l));
    }
}