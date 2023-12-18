import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();
        int result = 0;
        List<String> S = new ArrayList<String>();
        List<Integer> T = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            S.add(sn.next());
            T.add(sn.nextInt());
        }
        String X = sn.next();

        int index = S.indexOf(X);

        for(int j=index+1; j<N; j++){
            result = result + T.get(j);
        }

        System.out.println(result);
    }
}