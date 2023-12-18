import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Deque<Integer> de = new ArrayDeque<Integer>();
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++){
            int qu = sc.nextInt();
            switch(qu){
                case 0: int d = sc.nextInt(); if(d == 0) de.addFirst(sc.nextInt()); else de.addLast(sc.nextInt()); break;
                case 1: int p = sc.nextInt(); for(int i = 0 ; i < de.size() ; i++){ if(i == p) System.out.println(de.element()); de.addLast(de.element()); de.removeFirst();} break;
                case 2: int a = sc.nextInt(); if(a == 0) de.removeFirst(); else de.removeLast(); break;
            }
        }
    }
}
