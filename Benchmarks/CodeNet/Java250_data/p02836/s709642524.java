import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int count = 0;
        char[] l = new char[S.length()];
        for(int i = 0; i < S.length(); i++){
            l[i] = S.charAt(i);
        }
        if(S.length() % 2 == 0){
            for(int i = 0; i < S.length()/2; i++){
                if(l[i] != l[S.length()-1 - i]) count++;
            }
        }else{
            for(int i = 0; i < (S.length()-1)/2; i++){
                if(l[i] != l[S.length()-1 - i]) count++;
            }
        }

        System.out.println(count);
    }
}