
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        long[] Acc=new long[N+1];

        for(int i=1;i<Acc.length;i++){
            Acc[i]=Acc[i-1]+scanner.nextInt();
        }
        Map<Long,Long> map=new HashMap<>();
        for(int i=0;i<Acc.length;i++){
            map.put(Acc[i]%M,map.getOrDefault(Acc[i]%M,0l)+1);
        }
        long result=0;
        for(Long key:map.keySet()){
            long num=map.get(key);
            result+=(num*(num-1))/2;
        }
        System.out.println(result);
    }


}
