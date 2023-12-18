import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		boolean[] r=new boolean[c.length];
		for(int i=0;i<r.length;i++){
			if(c[i]=='R'){
				r[i]=true;
			}
		}
		int min=r.length;
		int cost;
		int r2w;
		int w2r;
		for(int i=0;i<=r.length;i++){
			r2w=0;
			w2r=0;
			for(int j=0;j<r.length;j++){
				if(j<i&&!r[j]){
					w2r++;
				}
				if(i<=j&&r[j]){
					r2w++;
				}
			}
			if(r2w<w2r){
				cost=w2r;
			}else{
				cost=r2w;
			}
			
			if(cost<min){
				min=cost;
			}
		}		
		System.out.println(min);
	}
}