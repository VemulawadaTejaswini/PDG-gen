import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] S = scan.next().split("");
        int count = 0;
        for(int i = 0; i < S.length; i++){
            if(S[i].equals("R")) count++;
        }
        System.out.println(count);
    }
}
