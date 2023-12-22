import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        String st = "ID";
        int x = 0;
        int max = 0;

        for(int i=0; i<N; i++){
            if(S.charAt(i)==st.charAt(0)){
                x += 1;
            }
            else{
                x -= 1;
            }
            max = Math.max(max, x);
        }
        System.out.println(max);
    }
}