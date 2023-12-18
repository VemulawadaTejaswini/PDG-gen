
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(true) {
			int n=in.nextInt(),l=in.nextInt(),r=in.nextInt();
			if(n==0)break;
			
			List<Integer> A=new ArrayList<>();
			for(int i=0;i<n;i++) {
				A.add(in.nextInt());
			}
			
			int cnt=0;
			
			for(int i=l;i<=r;i++) {
				int j;
				for(j=0;j<A.size();j++) {
					if(i%A.get(j)==0) {
						if((j+1)%2==1)cnt++;
						break;
					}
				}
				
				if(j==A.size() && A.size()%2==0)cnt++;
			}
			
			System.out.println(cnt);
		}
		
		
	}

}

