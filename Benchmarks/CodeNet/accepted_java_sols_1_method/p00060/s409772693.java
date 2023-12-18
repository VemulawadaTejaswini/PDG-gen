import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			boolean[] flag=new boolean[11];
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			int c3=sc.nextInt();
			flag[c1]=true;
			flag[c2]=true;
			flag[c3]=true;
			int limit=20-c1-c2;
			if(limit>10){
				System.out.println("YES");
			}else{
				int count=0;
				for(int i=limit;i>=1;i--){
					if(!flag[i]){
						count++;
					}
				}
				System.out.println(count>=4?"YES":"NO");
			}
		}
	}
}