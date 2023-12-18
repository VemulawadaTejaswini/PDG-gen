import java.util.Scanner;

 class Main{
    int ninzu,k;
	int ban;
	
    public void solve(){
        Scanner sc = new Scanner(System.in);
    
	     for(int i=0;i<4;i++){
		 	ban= sc.nextInt();
			if(ban==1){
				k = 6000;
				}else if(ban==2){
					k = 4000;
					}else if(ban==3){
						k = 3000;
					}else{
						k = 2000;
					}
					ninzu = sc.nextInt();
					int uriage = k*ninzu;
					System.out.println(uriage);
	     }
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}