import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int[] X = new int[N];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            X[i] = sc.nextInt();
            list.add(X[i]);
        }

        Collections.sort(list);

        int ml = list.get(N / 2 - 1);
        int mr = list.get(N / 2);

        for(int i=0; i<N; i++){
            if(X[i]<=ml){
                System.out.println(mr);
            }
            else{
                System.out.println(ml);
            }
        }
    }
}