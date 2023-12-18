import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
        int m = sc.nextInt();
		int Alist[] = new int[a];
        int Blist[] = new int[b];
        int x[] = new int[m];
        int y[] = new int[m];
        int c[] = new int[m];
        int i;
        int ans = 0;
        for(i = 0;i < a;i++){
          Alist[i] = sc.nextInt();
        }
      	for(i = 0;i < b;i++){
          Blist[i] = sc.nextInt();
        }      	
        for(i = 0;i < m;i++){
          x[i] = sc.nextInt();
          y[i] = sc.nextInt();
          c[i] = sc.nextInt();
        }
      	ans = Alist[x[0] - 1] + Blist[y[0] - 1] - c[0];
      	for(i = 1;i < m;i++){
          if(Alist[x[i] - 1] + Blist[y[i] - 1] - c[i] <= ans){
            ans = Alist[x[i] - 1] + Blist[y[i]-1] - c[i];
          }
        }
      	
        Arrays.sort(Alist);
        Arrays.sort(Blist);
        if(Alist[0] + Blist[0] < ans){
        ans = Alist[0] + Blist[0];
        }
      	
        System.out.println(ans);   
    }
}