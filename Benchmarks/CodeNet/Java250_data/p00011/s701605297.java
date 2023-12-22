import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int w,n,a,b,i,tmp;
		w=s.nextInt();//ツ縦
		n=s.nextInt();//ツ可。
		int k[]=new int[w+1];
		for(i=1;i<=w;i++){
			k[i]=i;
		}
		for(i=0;i<n;i++){
			String[] str=s.next().split(",");
			a=Integer.parseInt(str[0]);
			b=Integer.parseInt(str[1]);
			tmp=k[a];
			k[a]=k[b];
			k[b]=tmp;
		}
		for(i=1;i<=w;i++){
			System.out.println(k[i]);
		}
	}
}