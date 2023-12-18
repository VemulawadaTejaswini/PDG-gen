import java.util.Scanner;
public class Main{
	
	public void solve(){
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			int nkin = sc.nextInt();
			int pkin = sc.nextInt();
			int nsu = sc.nextInt();
			int psu = sc.nextInt();
			int gokei = nkin*nsu + pkin*psu;
			
			if(nsu>=5 && psu>=2){
				gokei = (nkin*nsu + pkin*psu)*4/5;
			}else{
				if(nsu<5){
					nsu = 5;
				}
				if(psu<2){
					psu = 2;
				}
				int hiki = (nkin*nsu + pkin*psu)*4/5;
				if(gokei>hiki){
					gokei = hiki;
				}
			}
		    System.out.println(gokei);
		}
	} 
				
    public static void main(String args[]){
        Main obj = new Main();
        obj.solve();
    }
}