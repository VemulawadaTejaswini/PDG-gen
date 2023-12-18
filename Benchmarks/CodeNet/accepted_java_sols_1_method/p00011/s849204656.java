import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int num[]=new int[w+1];
		for(int i=1;i<=w;i++){
			num[i]=i;
		}

		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			String[] str=sc.next().split(",");
			int a=Integer.parseInt(str[0]);
			int b=Integer.parseInt(str[1]);
			int c=num[a];
			num[a]=num[b];
			num[b]=c;
		}

		for(int i=1;i<=w;i++){
			System.out.println(num[i]);
		}
		sc.close();
	}

}