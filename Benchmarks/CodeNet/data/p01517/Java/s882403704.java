import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	int n;

	class Country{
		int id;
		int string;
		long enemy;
		List<String> Node=new ArrayList<String>();

		public void parseNode(){
			enemy=0L;
			for(String node:Node){
				enemy+=(1<<nametoId.get(node));
			}
		}
	}

	HashMap<String,Integer> nametoId;

	public void run(){
		Scanner sc=new Scanner(System.in);
		while(true){
			n=sc.nextInt();
			nametoId=new HashMap<String, Integer>();
			if(n==0){
				break;
			}
			Country[] colist=new Country[n];


			for(int i=0;i<n;i++){
				colist[i]=new Country();
				String name=sc.next();
				int string=sc.nextInt();
				if(!nametoId.containsKey(name)){
					nametoId.put(name,nametoId.size());
				}
				colist[i].id=i;
				colist[i].string=string;

				int links=sc.nextInt();

				for(int j=0;j<links;j++){
					String name1=sc.next();
					colist[i].Node.add(name1);
				}
			}

			for(Country c :colist){
				c.parseNode();
			}
			//BitSet dp=new BitSet(n);

			Set<Long> dp=new HashSet<Long>();
			dp.add(1L);
			int res=0;
			for(int i=0;i<n;i++){
				if(colist[i].enemy==0){
					res+=colist[i].string;
					continue;
				}
				Set<Long> tmp=new HashSet<Long>();
				for(long d:dp){
					long nxtmap=d+(1<<i);
					if((colist[i].enemy & nxtmap)==0){
						tmp.add(nxtmap);
					}else{
					}
				}
				dp.addAll(tmp);
			}
			int max=0;
			for(long d:dp){
				int i=0;
				int val=0;
				while(d>0){
					if(d%2==1){
						val+=colist[i].string;
					}
					d/=2;
					i++;
				}
				max=Math.max(val,max);
			}
			pr(max+res);
		}
	}




	public static void main(String[] _) throws Exception {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.println(o);
	}
}