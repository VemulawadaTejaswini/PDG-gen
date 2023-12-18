import java.util.Scanner;

public class Main{
	class item{
		String str;
		private int cost;
		private String[] mate;
		private int n;
		
		item(){
			str = "";
			cost = 0;
			n = 0;
		}
		
		item(String str, int cost){
			this.str = str;
			this.cost = cost;
			n = 0;
		}
		
		void setMat(String[] mate, int n){
			this.mate = mate;
			this.n = n;
		}
		
		int getCost(item[] list, int m){
			if(n == 0){
				return cost;
			}
			int v = 0;
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					if(mate[i].equals(list[j].str)){
						v += list[j].getCost(list, m);
						break;
					}
				}
			}
			
			if(v < cost){
				return v;
			} else {
				return cost;
			}
		}
	}
	
	Main(){
		Scanner sc = new Scanner(System.in);
		String str;
		
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			item[] ilist = new item[n+1];
			for(int i = 0; i < n; i++){
				str = sc.next();
				int cost = sc.nextInt();
				ilist[i] = new item(str, cost);
			}
			
			int m = sc.nextInt();
			for(int i = 0; i < m; i++){
				str = sc.next();
				int l = sc.nextInt();
				String[] st = new String[l+1];
				for(int j = 0; j < l; j++){
					st[j] = sc.next();
				}
				for(int j = 0; j < n; j++){
					if(str.equals(ilist[j].str)){
						ilist[j].setMat(st, l);
						break;
					}
				}
			}
			str = sc.next();
			
			for(int i = 0; i < n; i++){
				if(str.equals(ilist[i].str)){
					System.out.println(Integer.toString(ilist[i].getCost(ilist, n)));
					break;
				}
			}
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}