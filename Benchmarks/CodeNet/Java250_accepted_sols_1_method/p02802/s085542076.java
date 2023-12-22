import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        Map<Integer,String> problemMap = new HashMap<>();
        int AC = 0;
        int[] WA = new int[101000];
        for(int i=0;i<M;i++){
            int probNo = Integer.parseInt(sc.next());
            String str = sc.next();
            if(problemMap.containsKey(probNo) && problemMap.get(probNo).equals("AC"))continue;
            problemMap.put(probNo,str);
            if(str.equals("AC")){
                AC++;
            }else{
                WA[probNo]++;
            }
        }
        int totalWA = 0;
        for(int i=1;i<=N;i++){
            if(problemMap.containsKey(i) && problemMap.get(i).equals("AC")){
                totalWA += WA[i];
            }
        }
        System.out.println(AC + " " + totalWA);
    }
}
