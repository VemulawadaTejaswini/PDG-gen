import java.util.*;
class  Main{
	Scanner sc= new Scanner(System.in);
	void aaaa(){
		int gundam=0;
		int n=sc.nextInt();
		int[] N=new int[n];
		for(int i=0;i<n;i++)N[i]=sc.nextInt();
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			int Q=sc.nextInt();
			for(int j=0;j<n;j++){
				if(N[j]==Q){
					gundam++;
					break;
				}
			}
		}
		System.out.println(gundam);
	}
	public static void main(String[]args){
		new Main().aaaa();
		
	}
}