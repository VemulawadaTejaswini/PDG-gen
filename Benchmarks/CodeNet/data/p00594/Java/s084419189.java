import java.util.*;

public class Main{
	public static void main(String[] args){
		int i,n,maxNo,maxCount,key;
		Integer rst;
		Scanner scan = new Scanner(System.in);

		while(true){
			HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
			if((n=scan.nextInt()) == 0) break;

			for(i=maxCount=maxNo=0;i<n;i++){
				key = scan.nextInt();
				rst = hm.get(key);

				if(rst == null) hm.put(key,1);
				else{
					rst++;	
					hm.put(key,rst);
					if(maxCount < rst){
						maxCount = rst;
						maxNo = key;
					}
				}
			}

			if(maxCount > n/2) System.out.println(maxNo);
			else System.out.println("NO COLOR");
		}
	}
}