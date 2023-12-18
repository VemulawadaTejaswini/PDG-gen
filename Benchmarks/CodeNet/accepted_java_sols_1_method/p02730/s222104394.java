import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean isStrong = true;


        for(int i=0;i<S.length();i++){
            if(S.charAt(i) != S.charAt(S.length()-i-1)){
                isStrong = false;
            }
        }

        int N = S.length();
        for(int i=0;i <(N-1)/2;i++){
            if(S.charAt(i) != S.charAt((N-1)/2-i-1)){
                isStrong = false;
            }
        }

        for(int i=(N+3)/2+1;i<N;i++){
            if(S.charAt(i) != S.charAt(N-i-1)){
                isStrong = false;
            }
        }



        if(isStrong){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }



    }

}







