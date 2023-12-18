import java.util.*;
 
import java.io.*;
 
public class Main{
    
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[] A = new int[M];
        int[] B = new int[M];
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = 0; i < N; i++){
            list.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < M; i++){
            A[i] = s.nextInt()-1;
            B[i] = s.nextInt()-1;
            list.get(A[i]).add(B[i]);
            list.get(B[i]).add(A[i]);
        }
        
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        Queue<Integer> Q = new ArrayDeque<>();
        boolean[] permit = new boolean[N];
        Q.add(0);
        permit[0] = true;
        hash.put(0, 0);
        while(!Q.isEmpty()){
            int v = Q.poll();
            permit[v] = true;
            for(int i = 0; i < list.get(v).size(); i++){
                if(permit[list.get(v).get(i)] == false){
                    permit[list.get(v).get(i)] = true;
                    hash.put(list.get(v).get(i), v+1);
                    Q.add(list.get(v).get(i));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Yes" + "\n");
        for(int a = 1; a < N; a++){
            if(hash.containsKey(a)){
                sb.append(hash.get(a) + "\n");
            }else{
                System.out.println("No");
                System.exit(0);
            }
        }

        
        System.out.print(sb.toString());
        

 
	}
} 