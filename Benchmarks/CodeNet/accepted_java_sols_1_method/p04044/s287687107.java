import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        String ans = "";
        ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<N; i++){
            list.add(sc.next());
        }

        Collections.sort(list);

        for(int i=0; i<N; i++){
            ans += list.get(i);
        }
        System.out.println(ans);
    }
}