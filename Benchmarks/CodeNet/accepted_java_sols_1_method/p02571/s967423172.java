import java.util.*;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();

        int res=1000;

        for(int i=0; i<S.length-T.length+1; i++){
            int count=T.length;
            for(int j=0; j<T.length; j++){
                if(S[i+j]==T[j]){
                    count--;
                }
            }
            res = Math.min(res,count);
        }
        
        System.out.println(res);
}

}

