import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] S = scan.next().split("");
        int count = 0;
        for(int i = 0; i < S.length; i++){
            if(i == 0 && S[i].equals("R")) count++;
            else if(S[i-1].equals("R") && S[i].equals("R")) count++;
            else if(S[i-1].equals("S") && S[i].equals("R")) count = 1;
        }
        System.out.println(count);
    }
}
