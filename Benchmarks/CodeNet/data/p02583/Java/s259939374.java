import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> henMap = new HashMap<>();
        for(int i=0;i<N;i++){
            int len = sc.nextInt();
            henMap.putIfAbsent(len, 0);
            henMap.put(len, henMap.get(len)+1);
        }
        List<Integer> henLst = new ArrayList<>();
        henLst.addAll(henMap.keySet());
        int cnt = 0;
        for(int i=0;i<henLst.size();i++){
            for(int j=i+1;j<henLst.size();j++){
                for(int k=j+1;k<henLst.size();k++){
                    if(henLst.get(i) + henLst.get(j) > henLst.get(k))
                        cnt += henMap.get(henLst.get(i))*henMap.get(henLst.get(j)) * henMap.get(henLst.get(k));

                }
            }
        }
        System.out.println(cnt);
    }

}
