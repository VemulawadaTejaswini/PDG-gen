import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			int n=in.nextInt(),l=in.nextInt();
			if(n==0)break;
			List<Integer> A=new ArrayList<>();
			for(int i=0;i<n;i++)A.add(Integer.parseInt(in.next()));
			Collections.sort(A,Collections.reverseOrder());
			int max=0;
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					int sum=A.get(i)+A.get(j);
					if(sum<=l)max=Math.max(max,sum);
				}
			}
			
			if(max>0)System.out.println(max);
			else System.out.println("NONE");
		}
		
	}

}

