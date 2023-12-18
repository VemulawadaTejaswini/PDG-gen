import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean index[]=new boolean[10000000];
		Arrays.fill(index, true);
		index[0]=false;index[1]=false;
		for(int i=0;i<index.length;i++){
			if(index[i]){
				for(int j=i+i;j<index.length;j+=i){
					index[j]=false;
				}
			}
		}
		while(true){
			int a=sc.nextInt();
			int d=sc.nextInt();
			int n=sc.nextInt();
			if(a+d+n==0)break;
			int x=0,i=0;
			for(i=0;i<index.length;i++){
				if(index[a+d*i])x++;
				if(x==n)break;
			}
			System.out.println(a+d*i);
		}

	}

}