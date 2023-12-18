import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int a=0;a<N;a++) list.add(sc.nextInt());
        Collections.sort(list);
        int min= 999999999;
        for(int a=0;a<N-K+1;a++){
            if(min>list.get(a+K-1)-list.get(a)) min = list.get(a+K-1)-list.get(a);
        }
        System.out.println(min);
    }
}
