import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tmpStr=scanner.nextLine().split(" ");
        int ans=0;
        int N = Integer.parseInt(tmpStr[0]);
        int K = Integer.parseInt(tmpStr[1]);
        List<Integer> list = new ArrayList<>();
        String[] tmpStr2=scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(tmpStr2[i]));
        }
        Collections.sort(list);
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        int baketuNum = set.size();
        int sabun=set.size()-K;
        if(sabun>0){
            int count[] = new int[baketuNum];
            List<Integer> list2 = new ArrayList<>();
            int tmpNum=0;
            int baketuIndex=-1;
            for (int i = 0; i < list.size(); i++) {
                if(tmpNum!=list.get(i)){
                    tmpNum=list.get(i);
                    baketuIndex++;
                }
                count[baketuIndex]++;
            }
            for (int v:count){
                list2.add(v);
            }
            Collections.sort(list2);
            for (int i = 0; i < sabun; i++) {
                ans+=list2.get(i);
            }
        }
        System.out.println(ans);
    }
}