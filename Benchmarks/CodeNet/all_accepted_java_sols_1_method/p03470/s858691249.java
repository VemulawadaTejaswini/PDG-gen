import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }
        
        TreeSet <Integer> tree = new TreeSet <Integer> ();
        for(int i=0; i<N; i++){
            tree.add(new Integer(a[i]));
        }
        System.out.println(tree.size());
    }
}