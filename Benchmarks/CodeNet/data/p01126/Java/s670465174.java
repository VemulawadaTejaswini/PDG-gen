import java.util.*;
public class Main {
	static class pair{
		int x;
		char symbol;//+ or -
		pair(int x,char symbol){
			this.x = x;
			this.symbol = symbol;
		}
	}
	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt(), m=sc.nextInt(), a=sc.nextInt();
			//pair[] pa = new pair[n];
			ArrayList<ArrayList<pair>>al = new ArrayList<ArrayList<pair>>();
			pair ini = new pair(0,'+');
			ArrayList<pair> li_ini = new ArrayList<pair>();
			li_ini.add(ini);
			for(int i=0;i<n;i++) al.add(li_ini);
			if((n|m|a)==0) break;
			for(int i=0;i<m;i++){
				int h=sc.nextInt(),p=sc.nextInt(),q=sc.nextInt();
				pair pa = new pair(h,'+');
				ArrayList<pair> li_pa = (ArrayList<pair>) al.get(p-1).clone();
				li_pa.add(pa);
				pair pa2 = new pair(h,'-');
				ArrayList<pair> li_pa2 = (ArrayList<pair>) al.get(q-1).clone();
				li_pa2.add(pa2);
				al.set(p-1, li_pa);
				al.set(q-1, li_pa2);
			}
			int height =m+1;
			int wh = a;
			while(true){
				ArrayList<pair> check = al.get(wh-1);
				pair target = null;
				int max = 0;
				for(pair check_pair : check){
					int temp = check_pair.x;
					if(temp<height&&temp>max){
						max = temp;
						target = check_pair;
					}
				}
				height = max;
				if(max == 0) break;
				if(target.symbol=='+'){ 
					wh++;
				}else{
					wh--;
				}
			}
			System.out.println(wh);
		}
	}
}