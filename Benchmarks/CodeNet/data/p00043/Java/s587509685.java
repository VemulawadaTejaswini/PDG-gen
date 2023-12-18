import java.util.Scanner;

public class Main {

	static int[] hai;
	static int addHai;
	static boolean ans[];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			String str = cin.next();
			hai = new int[10];
			ans= new boolean[10];
			for(int i=0;i<str.length();i++){
				hai[str.charAt(i)-'0']++;
			}
			for(int i = 1;i<10;i++){
				if(hai[i]<4){
					
					hai[i]++;
					addHai=i;
					bfs(14);
					hai[i]--;
				}
			}
			boolean first = true;
			for(int i = 0;i<10;i++){
				if(ans[i]){
					if(first){
						first=false;
						System.out.print(i);
					}else{
						System.out.print(" "+i);
					}
				}
			}
			if(first){
				System.out.print(0);
			}
			System.out.println();
		}
		
			
	}
	static void bfs(int haiCount){
		//print(hai);
		if(haiCount==2){
			// 頭
			for(int i = 1;i<10;i++){
				if(hai[i]==2){
					ans[addHai]=true;
				}
			}
		}
		// 刻子
		for(int i = 1;i<10;i++){
			if(hai[i]>=3){
				hai[i]=hai[i]-3;
				bfs(haiCount-3);
				hai[i]=hai[i]+3;
			}
		}
		
		for(int i = 1;i<8;i++){
			if(hai[i]>0&&hai[i+1]>0&&hai[i+2]>0){
				hai[i]--;
				hai[i+1]--;
				hai[i+2]--;
				bfs(haiCount-3);
				hai[i]++;
				hai[i+1]++;
				hai[i+2]++;
			}
		}
	}
	static void print(int[] a){
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}