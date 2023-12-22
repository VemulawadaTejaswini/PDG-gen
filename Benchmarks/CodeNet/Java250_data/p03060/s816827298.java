import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int N;
        //HashMap<Integer,Integer> list = new HashMap()<Integer,Integer>();
        ArrayList<Integer> v = new ArrayList<Integer>();
        ArrayList<Integer> c = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        N=sc.nextInt();

        for(int i=0;i<N;i++){
            v.add(sc.nextInt());
        }
        
        for(int i=0;i<N;i++){
            c.add(sc.nextInt());
        }
        //Collections.sort(list);

        int ans = 0;
        for(int i=0;i<N;i++){
            if(v.get(i)-c.get(i)>0)
                ans += v.get(i)-c.get(i);
        }
        System.out.println(ans);
    }
}