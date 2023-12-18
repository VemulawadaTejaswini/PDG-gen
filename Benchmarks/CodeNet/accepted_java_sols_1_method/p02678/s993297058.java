import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int[] ans = new int[n];
    boolean[] visited = new boolean[n];
    ArrayList<Integer>[] edge = new ArrayList[n];
    ArrayList<Integer> queue = new ArrayList<>();
    for(int i = 0; i < n; i++){
          edge[i] = new ArrayList<>();
          ans[i] = -1;
          visited[i] = false;
        }

    for (int i = 0; i < m; i++) {
          int a = sc.nextInt()-1;
    		  int b = sc.nextInt()-1;
    		  edge[a].add(b);
    		  edge[b].add(a);
    		}

    queue.add(0);
    while(queue.size() != 0){
    int x = queue.get(0);
    queue.remove(0);
    for(int i : edge[x]){
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
    if(Arrays.asList(ans).contains(-1)){
         System.out.println("No");
    }
    else{
      System.out.println("Yes");
        for(int a: copyans){
          System.out.println(a+1);
        }
    }
  }
}
