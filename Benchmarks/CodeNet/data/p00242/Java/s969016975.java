import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		while(true){
			int n = Integer.parseInt(in.nextLine());
			if(n==0)break;
			new AOJ0242().doIt(n);
		}
	}
	
	class AOJ0242{
		void doIt(int n){
			HashMap<String,KeepString> map = new HashMap<String,KeepString>();
			for(int i=0;i<n;i++){
				String[] a = in.nextLine().split(" ");
				for(int s=0;s<a.length;s++){
					if(!map.containsKey(a[s]))map.put(a[s],new KeepString(a[s]));
					map.get(a[s]).cnt++;
				}
			}
			ArrayList<KeepString> list = new ArrayList<KeepString>();
			for(String str: map.keySet())list.add(map.get(str));
			Collections.sort(list);
//			for(int i=0;i<list.size();i++)System.out.println(list.get(i));//deba
			char[] target = in.nextLine().toCharArray();
			String result = "";
			int cnt = 0;
			for(int i=0;i<list.size();i++)if(list.get(i).word.charAt(0)==target[0]){
				if(result.length()>0)result+=" ";
				result+=list.get(i).word;
				cnt++;
				if(cnt>4)break;
			}
			if(result!="")System.out.println(result);
			else System.out.println("NA");
		}
		class KeepString implements Comparable<KeepString>{
			int cnt;
			String word;
			public KeepString(String word) {
				cnt = 0;
				this.word = word;
			}
			public int compareTo(KeepString o) {
				if(this.cnt>o.cnt)return -1;
				else if(this.cnt<o.cnt)return 1;
				else if(this.word.compareTo(o.word)>0)return 1;
				else return -1;
			}
			
			public String toString(){
				return this.word+" "+cnt;
			}
		}
	}
}