import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int max=0;
        for(int i=1;i<N;i++){
            int cnt =0;
            String X= S.substring(0,i);
            HashSet Xset = new HashSet();
            String Y =S.substring(i);
            HashSet Yset = new HashSet();
            for(int j=0;j<X.length();j++){
                Xset.add(X.charAt(j));
            }
            for(int k=0;k<Y.length();k++){
                Yset.add(Y.charAt(k));
            }
            Iterator iterater = Xset.iterator();
            while(iterater.hasNext()){
                if(Yset.contains(iterater.next())){
                    cnt++;
                }
            }
            if(cnt>=max){
                max =cnt;
            }
        }
        System.out.println(max);
    }
}