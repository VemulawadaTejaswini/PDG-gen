import java.util.*;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] a = new int[m];
        int[] b = new int[m];
        int[] ans = new int[n];
        boolean[] visited = new boolean[n];
        List<Integer>[] g = new ArrayList[n];
        List<Integer> queue = new ArrayList<>();
        for(int i=0; i<n; i++) {
            g[i] = new ArrayList<>();
            visited[i] = false;
            ans[i] = -1;
        }
        
        for(int i=0; i<m; i++) {
            a[i] = Integer.parseInt(sc.next())-1;
            b[i] = Integer.parseInt(sc.next())-1;
            g[a[i]].add(b[i]);
            g[b[i]].add(a[i]);
        }
        
        queue.add(0);
        while(queue.size() != 0) {
            int x = queue.get(0);
            queue.remove(0);
            for(int i : g[x]) {
                if(visited[i] == false){
                    queue.add(i);
                    if(ans[i] == -1){
                        ans[i] = x;
                        visited[i] = true;
                    }
                } 
            }
        }
        
        int[] copyans = Arrays.copyOfRange(ans, 1, ans.length);
        if(Arrays.asList(ans).contains(-1)) System.out.println("No");
        else {
            System.out.println("Yes");
            for(int i : copyans) {
                System.out.println(i+1);
            }
        }
    }
    
    
}