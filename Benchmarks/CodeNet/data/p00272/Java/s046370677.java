import java.util.Scanner;
 class Main{
 	
	
	public void solve(){
		Scanner sc =new Scanner(System.in);
	    int ban,hito,uriage,i;
		for(int b=0;b<4;b++){
			ban=sc.nextInt();
			if(ban==1){
				i=6000;
			}else if(ban==2){
				i=4000;
			}else if(ban==3){
				i=3000;
			}else{
				i=2000;
			}
			hito=sc.nextInt();
			uriage=i*hito;
			System.out.println(uriage);
		}
	}
	public static void main(String[] args){
		Main obj = new Main();
		obj.solve();
	}
 }
	