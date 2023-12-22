import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        String output = "No";
        if(N%2 == 0){
            String first = S.substring(0,N/2);
            String second = S.substring(N/2);
            if(first.equals(second)){
                output = "Yes";
            }
        }
        System.out.println(output);
    }
}
