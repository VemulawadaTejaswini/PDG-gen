
import java.util.*;

/**
 * 官方题解的解法：
 *
 * 维护W个区间[start,end] ，start表示从第一行的第start个点出发，end表示达到当前行时能够到达的最左边的点
 * 对于每一行的每个区间，其更新策略为：如果 B[i] >= end >= A[i],则将区间更新为 [start,B[i] + 1] ,如果B[i] + 1 > W ,则更新为 [start,+无穷]
 * 对于样例1来说:
 * 初始状态的W为  [1,1] [2,2] [3,3] [4,4]      ans = 0
 * 第二行的W为：  [1,2] [2,5] [3,5] [4,5]      ans = 2-1 = 1
 * 第三行的W为   [1,4] [2,5] [3,5] [4,5]       ans = 4-1 = 3
 * 第四行的W为   [1,5] [2,5] [3,5] [4,5]       ans = -1
 *
 *
 * 那么对于每一行而言，答案就是 min(W[i].end-W[i].start) (w>= i >=1)
 *
 * 对于实现方案，官方说有两种，一种用线段树一种用set+mutilSet，但是我想不到怎么用线段树更新
 *
 * Created by enpingkuang on 2020/9/12 6:54 下午
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        TreeMap<Integer,Integer> ans = new TreeMap<>();
        TreeMap<Integer,Integer> intervals = new TreeMap<>();
        ans.put(0,w);
        for(int i =1;i<=w;i++){
            intervals.put(i,i);
        }
        for(int i = 0;i<h;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            SortedMap<Integer,Integer> sortedMap =  intervals.tailMap(a);
            if(sortedMap != null){
                int max = 0;
                List<Integer> endList = new ArrayList<>();
                for(Iterator<Map.Entry<Integer,Integer>> iterator = sortedMap.entrySet().iterator();iterator.hasNext();){
                    Map.Entry<Integer,Integer> entry = iterator.next();
                    if(entry.getKey() > b){
                        break;
                    }
                    max = Math.max(max,entry.getValue());
                    endList.add(entry.getKey());
                    Integer count = ans.get(entry.getKey()-entry.getValue());
                    if(count == 1){
                        ans.remove(entry.getKey()-entry.getValue());
                    }else{
                        ans.put(entry.getKey()-entry.getValue(),count-1);
                    }
                }
                for(Integer integer:endList){
                    intervals.remove(integer);
                }
                if(b + 1 <= w){
                    Integer oldValue = intervals.get(b+1);
                    if(oldValue != null){
                        int count = ans.get(b + 1 - oldValue);
                        if(count == 1){
                            ans.remove(b + 1 - oldValue);
                        }else{
                            ans.put(b + 1 - oldValue,count-1);
                        }
                    }
                    intervals.put(b+1,max);
                    ans.merge(b + 1 -max, 1, Integer::sum);
                }
            }
            if(ans.isEmpty()){
                System.out.println(-1);
            }else {
                System.out.println(ans.firstKey() + i + 1);
            }
        }
    }
}
