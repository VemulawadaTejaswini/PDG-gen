import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        String S = scn.next();
        int ans =0;

        for(int i=0;i<N-2;i++){
            if(i==N-2){
                break;
            }
            if(S.substring(i,i+3).equals("ABC")){
                ans +=1;
            }
        }

        System.out.println(ans);

        scn.close();

    }


}
