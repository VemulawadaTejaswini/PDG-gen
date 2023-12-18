import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] S = sc.next().split("");
        String ret = "Yes";
        if (S[0].equals(S[1]) && S[1].equals(S[2])) {
            ret = "No";
        }
        System.out.println(ret);
    }
}