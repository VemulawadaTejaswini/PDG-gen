import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        List<Long> numList = new ArrayList<>();
        List<Long> queryList = new ArrayList<>();
        for(int i=0;i<N;i++){
            numList.add(Long.parseLong(sc.next()));
        }
        long volume = 0;
        for(int i=0;i<N;i++){
            volume += numList.get(i);
            queryList.add(volume);
        }
        long max = 0;
        for(int i=0;i<N-K+1;i++){
            long sectionMax = 0;
            if(i == 0){
                sectionMax = queryList.get(i+K-1);
            }else{
                sectionMax =  queryList.get(i+K-1) - queryList.get(i -1);
            }
            max = Math.max(sectionMax,max);
        }
        double result = (max + K)/2.0;
        System.out.println(String.format("%.12f",result));
}
}