import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
      	Set<Integer> set = new HashSet<Integer>();
        Integer h[] = new Integer[n];
        for (int i=0; i<n; i++) {
            h[i] = sc.nextInt();
          	set.add(i+1);
        }
      int a = 0;
      int b = 0;
      int ah = 0;
      int bh = 0;
      	for (int l=0; l<m; l++){
          a = sc.nextInt();
          ah = h[a-1];
          b = sc.nextInt();
          bh = h[b-1];
          
        if(ah == bh){
          set.remove(a);
          set.remove(b);
        }else if(bh > ah){
          set.remove(a);
        }else{
          set.remove(b);
        }
     }
            System.out.println(set.size());
    }
}