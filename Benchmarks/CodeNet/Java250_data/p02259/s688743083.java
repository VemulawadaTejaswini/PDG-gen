import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	int[] su=new int[100];
	int sum;
	void go(){
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++){
			su[i]=sc.nextInt();
		}
		for(int i=n-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(su[j]>su[j+1]){
					sum++;
					int a=su[j+1];
					su[j+1]=su[j];
	  			  	su[j]=a;
				}
			}
		}
		for(int i=0; i<n; i++){
			if(i<n-1){
				System.out.print(su[i]+" ");
			}else{
				System.out.println(su[i]);
			}
		}
		System.out.println(sum);
	}
	public static void main(String[]agrs){
		new Main().go();
	}
}