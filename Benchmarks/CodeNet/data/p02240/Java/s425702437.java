import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer,ArrayList<Integer>> L = new HashMap<>();
        int [] Con = new int[n];
        Arrays.fill(Con,-1);
        for(int i=0;i<m;i++){
            int s = sc.nextInt();
            int t = sc.nextInt();
            if(L.containsKey(s)) L.get(s).add(t);
            else{
                ArrayList<Integer> A = new ArrayList<Integer>();
                A.add(t);
                L.put(s,A);
            }
            if(L.containsKey(t)) L.get(t).add(s);
            else{
                ArrayList<Integer> A = new ArrayList<Integer>();
                A.add(s);
                L.put(t,A);
            }
        }
        //探索
        for(int i=0;i<n;i++){
            if(Con[i]==-1) {
                Con[i] = i;
                Connection(L, i, Con,i);
            }
        }
        L.clear();
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int s = sc.nextInt();
            int t = sc.nextInt();
            int num = Con[s];
            if(Con[t]==num) System.out.println("yes");
            else System.out.println("no");
        }
    }
    public static void Connection(Map<Integer,ArrayList<Integer>> L,int now,int Con[],int cnt){
        ArrayDeque<Integer> Stack = new ArrayDeque<>();
        Stack.add(now);
        while(Stack.size()!=0){
            now = Stack.pop();
            if(L.get(now)!=null) {
                for(int i:L.get(now)){
                    if(Con[i] == -1){
                        Stack.add(i);
                        Con[i] = cnt;
                    }
                }
            }
        }
    }
}
