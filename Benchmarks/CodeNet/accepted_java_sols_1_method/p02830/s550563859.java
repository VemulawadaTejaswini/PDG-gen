import java.util.*;

class Main {
    public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();

        String S = stdIn.next();
        String T = stdIn.next();

        String B = "";
        String S_I;
        String T_I;
        for(int i=0; i<N; i++){
            S_I = String.valueOf(S.charAt(i));
            B=B.concat(S_I);
            T_I = String.valueOf(T.charAt(i));
            B=B.concat(T_I);
        }
        System.out.print(B);
        //List<String> A = new ArrayList<>();

        


    }
}