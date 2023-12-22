import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>(n);
        ArrayList<Integer> b = new ArrayList<Integer>(n);

        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }
        for(int i = 0; i < n; i++){
            b.add(sc.nextInt());
        }

        int max = 0;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j <= i; j++){
                count += a.get(j);
            }
            for(int j = i; j < n; j++){
                count += b.get(j);
            }
            if(count > max){
                max = count;
            }
        }

        System.out.println(max);
    }
}
