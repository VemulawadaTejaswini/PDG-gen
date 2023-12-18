import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a=sc.nextInt();
		
		int[][] list=new int[n+1][m+1];
		
		while(true){
			int h=sc.nextInt();
			int p=sc.nextInt();
			int q=sc.nextInt();
			
			if(h==0&&h==p&&h==q)break;
			
			list[p][h]=q;
			list[q][h]=p;		
		}
		
		int here=a;
		int length=m-1;
		while(true){
			if(length==0)break;
			if(list[here][length]!=0){
				here=list[here][length];
			}
			length--;
			
		}
		System.out.println(here);
		
	}

}