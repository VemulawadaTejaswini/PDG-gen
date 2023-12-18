import java.util.Scanner;
public class Main{
	
		int syurui;
		int zan;
		int set;
		int charenzik;
		int gokei;
		
		 
	public void solve(){
		Scanner sc = new Scanner(System.in);
		syurui = sc.nextInt();
			while(syurui!=0){
				gokei = 0;
				for(int i=1;i<=syurui;i++){
					zan = sc.nextInt();
					if(zan>=2){
						gokei = gokei+1;
					}
				}
				charenzik=1;
				for(int s=1;s<=syurui;s++){
					if(zan>0){
						charenzik = charenzik+1;
					}
				}
				if(gokei>0){
					System.out.println(charenzik);
				}else{
					System.out.println("NA");
				}
				syurui = sc.nextInt();
			}
	}
	public static void main(String[] args){
		Main obj = new Main();
		obj.solve();
	}
}