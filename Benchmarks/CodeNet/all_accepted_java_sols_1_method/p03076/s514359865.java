import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] x = new int[5];
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<5; i++){
            x[i] = sc.nextInt();
            for(int j=0; j<=130; j += 10){
                if(j>=x[i]){
                    list.add(j-x[i]);
                    break;
                }
            }
            ans += x[i];
        }
        Collections.sort(list);

        for(int i=0; i<4; i++){
            ans += list.get(i);
        }
        System.out.println(ans);

    }
}