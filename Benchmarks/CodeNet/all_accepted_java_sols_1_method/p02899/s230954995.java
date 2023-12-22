import java.util.*;
import java.util.Map;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int A[]=new int[N];
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> nmap = new HashMap<>();
        for(int i = 0;i<N;i++){
            map.put(i,sc.nextInt());
        }

        map.entrySet().stream().sorted(java.util.Map.Entry.comparingByValue()).forEach(s->{
            System.out.print(s.getKey()+1+" ");
        });

    }
}
