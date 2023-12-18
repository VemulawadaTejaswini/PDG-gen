import java.util.*;
import java.util.Map.Entry;

class Main {
	Scanner sc = new Scanner(System.in);

	class DLong{
		long val;
		public DLong(long _val){
			val=_val;
		}
	}
	public void run() {
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			LinkedHashMap<Integer,DLong> datalist=new LinkedHashMap<Integer,DLong>();
			for(int i=0;i<n;i++){
				int id=sc.nextInt();
				long val=sc.nextLong()*sc.nextLong();
				if(datalist.containsKey(id)){
					DLong v=datalist.get(id);
					v.val+=val;
				}else{
					datalist.put(id,new DLong(val));
				}
			}
			boolean isset=false;
			for(Entry<Integer,DLong> entry:datalist.entrySet()){
				if(entry.getValue().val>=1000000){
					ln(entry.getKey());
					isset=true;
				}
			}
			if(!isset){
				ln("NA");
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
	public static void pr(Object o) {
		System.out.print(o);
	}
	public static void ln(Object o) {
		System.out.println(o);
	}
	public static void ln() {
		System.out.println();
	}
}