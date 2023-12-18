import java.util.Scanner;
class Main{
	public void solve(){
		Scanner sc = new Scanner(System.in);
		
		int kaisu=1;
		int no=0;
		int n = sc.nextInt();
		
		while(n != 0){
			for(int cnt=0; cnt<n; cnt++){
				int zansu = sc.nextInt();
				
			if(zansu >= 2){
				kaisu ++;
			}else if(zansu == 1){
				no ++;
			}
			}
		
		
		if(kaisu >= 2){
			System.out.println(kaisu+no);
		}else{
			System.out.println("NA");
		}
		
		kaisu=1;
		no=0;
		n =sc.nextInt();
	}
}
public static void main(String[]args){
	Main obj = new Main();
	obj.solve();
}
}
			