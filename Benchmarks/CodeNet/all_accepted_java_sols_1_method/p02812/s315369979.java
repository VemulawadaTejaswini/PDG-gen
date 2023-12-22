import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[]ss = S.toCharArray();

        int cou = 0;
        for(int i=0; i<N-2; i++){
            if(ss[i]==('A') && ss[i+1]==('B') & ss[i+2]==('C')){
             cou++;
        }
        }
			System.out.println(cou);
    }
}