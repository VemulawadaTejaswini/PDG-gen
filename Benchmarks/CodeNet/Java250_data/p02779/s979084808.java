import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] A = new String[N];
        ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<N; i++){
            A[i] = sc.next();
            list.add(A[i]);
        }

        Collections.sort(list);

        for(int i=0 ; i<N-1; i++){
            if(list.get(i).equals(list.get(i+1))){
                System.out.println("NO");
                break;
            }
            if(i==N-2){
                System.out.println("YES");
            }
        }
    }
}
