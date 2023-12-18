
import java.util.Scanner;

 class Main{
 	int n;
	int k;
	int hoz=1;
	int x=0;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0){
		for(int i=0;i<n;i++){
			k=sc.nextInt();
						
				if(k>=2){
					hoz++;
				}else{
				}
				if(k==1){
					x++;
				}
			}
			
			if(hoz>=2){
				System.out.println(hoz+x);
			}else{
				System.out.println("NA");
			}
			
			hoz=1;
			x=0;
			n=sc.nextInt();
		}
	}

	public static void main(String[] args){
        Main obj =new Main();
        obj.solve();
    }
}