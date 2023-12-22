import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N,T;
        N=sc.nextInt();
        T=sc.nextInt();
        ArrayList<Integer> cost = new ArrayList<>();
        for(int a=0;a<N;a++){
            int c = sc.nextInt();
            int t=sc.nextInt();
            if(t<=T) cost.add(c);
        }
        if(cost.size()!=0) System.out.println(Collections.min(cost));
        else System.out.println("TLE");

    }
}