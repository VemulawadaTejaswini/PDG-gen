import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String str;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int table[]=new int[1000];
		int now=0;
		while((str=s.nextLine()).length()>2){
			int a=Integer.parseInt(str.split(",")[0]);
			int b=Integer.parseInt(str.split(",")[1]);
			if(map.containsKey(a)){
				int c=map.get(a);
				map.put(a,c+1);
			}else{
				map.put(a,1);
				table[now++]=a;
			}
		}
		while(s.hasNext()){
			str=s.nextLine();
			int a=Integer.parseInt(str.split(",")[0]);
			int b=Integer.parseInt(str.split(",")[1]);
			if(map.containsKey(a)){
				int c=map.get(a);
				map.put(a,c+10000);
			}else{
			}
		}
		Arrays.sort(table,0,now);
		for(int i=0;i<now;i++){
			int t=map.get(table[i]);
			int q=map.get(table[i])%10000+map.get(table[i])/10000;
			if(t>10000)System.out.println(table[i]+" "+q);
		}
	}
}