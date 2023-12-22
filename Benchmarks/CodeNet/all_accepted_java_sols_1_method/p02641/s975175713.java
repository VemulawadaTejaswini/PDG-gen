import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
      	int N = sc.nextInt();
      
      	Integer p[] = new Integer[N];
        for (int i=0; i<N; i++) {
            p[i] = sc.nextInt();
        }
		
      	int ans = 0;
      	int dis = 100;
		for(int i = 0;i<=220;i++){
          if(Arrays.asList(p).contains(i)) continue;
          //System.out.println(Math.abs(X - i));
          if(Math.abs(X - i) < dis) {
            dis = Math.abs(X - i);
            ans = i;
          }
        }
      	if (N == 0)
            System.out.println(X);
        else
            System.out.println(ans);
    }
}