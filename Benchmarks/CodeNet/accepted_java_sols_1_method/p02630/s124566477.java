import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		long []arr =new long[n];
		long sum=0;
		HashMap<Long,Long> hm=new HashMap<>();
		for(int i=0;i<n;i++){
			arr[i]=scn.nextLong();
			sum+=arr[i];
			if(hm.containsKey(arr[i])){
				hm.put(arr[i],  hm.get(arr[i])+1l);
			}else{
				hm.put(arr[i], 1l);
			}
		}
		//System.out.println(sum);
        int q =scn.nextInt();
        StringBuilder sb=new StringBuilder();
        while(q-->0){
        	long b=scn.nextLong();
        	long c=scn.nextLong();
        	if(hm.containsKey(b)==false){
        		sb.append(sum+""+'\n');
        		continue;
        	}
        	long count = hm.get(b);
        	sum+=(c-b)*count;
        	hm.remove(b);
        	if(hm.containsKey(c)){
        		hm.put(c, hm.get(c)+count);
        	}else{
        		hm.put(c, count);
        	}
        	//System.out.println(sum);
        	sb.append(sum+""+'\n');
        	
        }
        System.out.print(sb);
	}

}