
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt(), M = sc.nextInt();
        ArrayList<Integer> list0 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0;i<M;i++){
            list0.add(sc.nextInt()-1);   //最後に1を足せ
            list1.add(sc.nextInt()-1);
        }
        int[] ans = new int[N];
        for(int i=0;i<N;i++){
            ans[i] = -1;
        }
        ans[0] = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        List<Integer> deleteList = new ArrayList<>();
        int count = 0;
        while(queue.size() != 0){
            int iter = queue.poll();
            deleteList.clear();
            for(int i=0;i<list0.size();i++){
                if(list0.get(i) == iter && ans[list1.get(i)] == -1){
                    ans[list1.get(i)] = iter;
                    queue.add(list1.get(i));
                    deleteList.add(i);
                }else if(list1.get(i) == iter && ans[list0.get(i)] == -1){
                    ans[list0.get(i)] = iter;
                    queue.add(list0.get(i));
                    deleteList.add(i);
                }
            }
            int interCount = 0;
            for(int i : deleteList){
                list0.remove(i-interCount);
                list1.remove(i-interCount);
                interCount++;
                count++;
            }
            if(count >= N-1){
                break;
            }
        }
        boolean flag = false;
        for(int i=0;i<N;i++){
            if(ans[i] == -1){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("No");
        }else{
            for(int i=0;i<N;i++) {
                System.out.println(i == 0 ? "Yes" : ans[i]+1);
            }
        }
    }
}
