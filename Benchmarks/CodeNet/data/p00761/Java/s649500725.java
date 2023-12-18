
import java.util.*;

public class Main {
	static TreeMap<Integer,Integer> map;
	static String numstr;
	static int L;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(true) {
			numstr=in.next();
			map=new TreeMap<>();
			L=Integer.parseInt(in.next());
			if(L==0)break;
			map.put(Integer.parseInt(numstr), 0);
			
			int i=1,reskey;
			while(true) {
				int max=0,min=0;
				int diff=L-numstr.length(); 
				char[] numchars=numstr.toCharArray();
				Arrays.sort(numchars);
				int a=toNum(numchars);
				
				
				for(int j=0;j<numchars.length/2;j++) {
					char tt=numchars[j];
					numchars[j]=numchars[numchars.length-1-j];
					numchars[numchars.length-1-j]=tt;
				}
				int b=toNum(numchars);
				
				if(a>b) {
					max=a;
					min=b;
				}
				else {
					max=b;
					min=a;
				}
				max*=Math.pow(10, diff);
				
				//System.out.printf("a%d=%d-%d=%d\n",i,max,min,max-min);
				
				if(map.containsKey(max-min)) {
					reskey=max-min;
					numstr=String.valueOf(max-min);
					break;
				}
				else {
					map.put(max-min, i);
					i++;
					numstr=String.valueOf(max-min);
				}
			}
			
			System.out.println(map.get(reskey)+" "+numstr+" "+(i-map.get(reskey)));
		}
	}
	
	static int toNum(char[] A) {
		int sum=0;
		for(int i=0;i<A.length;i++) {
			sum+=(A[i]-48)*Math.pow(10, i);
		}
		return sum;
	}
}

