import java.util.Scanner;

public class Main{
	public void solve(){
		Scanner sc=new Scanner(System.in);
		int m=0;
		int i=1;
		int n=sc.nextInt();
		
		while(n!=0){
			for(int j=1;j<=n;j++){
				int k=sc.nextInt();
				
				if(k>=2){
					i++;
				}else if(k==1){
					m++;
				}
			}
			if(i>=2){
				System.out.println(i+m);
			}else{
				System.out.println("NA");
			}
			
			m=0;
			i=1;
			n=sc.nextInt();
		}
	}
		public static void main(String[] args){
			Main obj= new Main();
			obj.solve();
		}
}