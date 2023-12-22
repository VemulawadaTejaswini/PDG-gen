import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if((B<C && A<C) || (C<A && D<A)){
            System.out.println(0);
        }
        else{
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(A);
            list.add(B);
            list.add(C);
            list.add(D);
            Collections.sort(list);
            System.out.println(list.get(2) - list.get(1));
        }
    }
}