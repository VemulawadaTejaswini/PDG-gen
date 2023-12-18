import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        HashMap<Integer,Integer> B = new HashMap<>();
        HashMap<Integer,Integer> C = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int a = scanner.nextInt();
            B.putIfAbsent(i+1-a, 0);
            B.put(i+1-a, B.get(i+1-a)+1);
            C.putIfAbsent(i+1+a, 0);
            C.put(i+1+a, C.get(i+1+a)+1);
        }
        long res = 0;
        for(Integer bk:B.keySet()){
            if(C.containsKey(bk)){
                res += (long)B.get(bk) * (long)C.get(bk);
            }
        }
        System.out.println(res);
    }
}