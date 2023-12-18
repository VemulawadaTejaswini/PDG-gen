import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Set<Integer> setA=new HashSet<Integer>();
        Set<Integer> setB=new HashSet<Integer>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            setA.add(sc.nextInt());
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            setB.add(sc.nextInt());
        }
        setA.retainAll(setB);
        System.out.println(setA.size());
    }
}