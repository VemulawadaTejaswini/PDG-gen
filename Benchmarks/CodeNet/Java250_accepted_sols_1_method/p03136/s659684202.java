import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int lsum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for(int i=0; i<N-1; i++){
            lsum += list.get(i);
        }
        if(lsum>list.get(N-1)){
            System.out.println("Yes");
        }
        else if(lsum<=list.get(N-1)){
            System.out.println("No");
        }
        
    }
}