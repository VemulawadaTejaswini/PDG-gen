import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int a[]=new int[11];
		while(in.hasNext()){
			Arrays.fill(a,0);
			for(int i=1;i<=4;i++)
				a[in.nextInt()]=i;
			int hit=0,blow=0;
			for(int i=1;i<=4;i++){
				int x=in.nextInt();
				if(a[x]==i)
					hit++;
				else if(a[x]!=0)
					blow++;
			}
				System.out.println(hit+" "+blow);
		}
		in.close();
	}
}