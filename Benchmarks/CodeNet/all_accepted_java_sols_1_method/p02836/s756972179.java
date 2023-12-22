import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int len = S.length();
        int count = 0;

        for(int i=0; i<len/2; i++){
            if(S.charAt(i) != S.charAt(len-i-1)){
                count++;
            }
        }
        System.out.println(count);
    }
}