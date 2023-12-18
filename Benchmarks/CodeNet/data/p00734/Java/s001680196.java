import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(true){
			int n=in.nextInt(),m=in.nextInt();
			if(n==0)break;
			List<Integer> A=new ArrayList<>(), B=new ArrayList<>();

			int sumA=0,sumB=0;
			for(int i=0;i<n;i++){
				A.add(Integer.parseInt(in.next()));
				sumA+=A.get(i);
			}
			for(int i=0;i<m;i++){
				B.add(Integer.parseInt(in.next()));
				sumB+=B.get(i);
			}

			int a=-1,b=-1;
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					int x=A.get(i),y=B.get(j);
					if(sumA-x+y == sumB-y+x){
						a=x;b=y;break;
					}
				}
				if(a!=-1)break;
			}
			if(a!=-1)System.out.printf("%d %d\n",a,b);
			else System.out.println(-1);
		}
		
	}

}

