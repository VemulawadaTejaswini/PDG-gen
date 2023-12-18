import java.util.Scanner;
class Main{
	int nisuu;
	int nk,pk,nm,pm;
	int cnt;
	int x,y;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		
		nisuu = sc.nextInt();
		for(cnt=0; cnt<nisuu; cnt++){
			nk=sc.nextInt();
			pk=sc.nextInt();
			nm=sc.nextInt();
			pm=sc.nextInt();
			
			if(nm>=5 && pm>=2){
				x=(nk*8/10)*nm;
				y=(pk*8/10)*pm;
				
				System.out.println(x+y);
			}else{
				x=nk*nm;
				y=pk*pm;
				
				System.out.println(x+y);
		
				
		
		}
		}
	}
	
	public static void main(String[]args){
		Main obj = new Main();
		obj.solve();
		
	}
}