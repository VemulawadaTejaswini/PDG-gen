import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int ans = 0;
    	int cnt = 0;
		int N = sc.nextInt();
		int M = sc.nextInt();
		int H[]=new int[(N+1)];
		for(int i=1;i<=N;i++){
			H[i]=sc.nextInt();
		}
		//N個の頂点がありu,vはi番目の辺が結ぶ頂点を意味するものとする場合の入力データを二次元Listに取り込む
		List<List<Integer>> edge = new ArrayList<>();
		for(int i=1;i<=N+1;i++){
		  edge.add(new ArrayList<>());
		}
		//初期化
		for(int i=1;i<=N;i++){
		  edge.get(i).add(0);
		}
		
		for(int i=1;i<=M;i++){
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		  edge.get(a).add(b);
		  edge.get(b).add(a);		
		}
			
		for(int i=1;i<=N;i++){
			if (edge.get(i).size()-1==0) {
				ans=ans+1;		
			}
			else{
				cnt=0;	
				for(int j=1;j<=edge.get(i).size()-1;j++){
					if (H[i]>H[edge.get(i).get(j)]) {
						cnt=cnt+1;
					}
				}
				if (cnt==edge.get(i).size()-1) {
						ans=ans+1;
					}	
			}
		}
		System.out.println(ans);
		//System.out.print(ans);
		

    }
}