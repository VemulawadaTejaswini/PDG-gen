import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] a = new String[input.nextInt()];
        for (int i = 0; i < a.length; i++){
            a[i] = Integer.toString(input.nextInt());
        }
        List<String> l = Arrays.asList(a);
        Collections.reverse(l);
        System.out.println(String.join(" ", l));
    }
}