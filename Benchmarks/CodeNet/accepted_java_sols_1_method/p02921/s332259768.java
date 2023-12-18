import java.util.*;
class Main{
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String T = scan.next();
        int hit = 0;
        for(int i = 0;i < 3;i++){
            if(S.charAt(i) == T.charAt(i)){
                hit++;
            }
        }
        System.out.println(hit);
        scan.close();
    }
}