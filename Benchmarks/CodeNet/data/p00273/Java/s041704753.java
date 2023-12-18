import java.util.Scanner;
public class Main{
	
	int huro;
	int puru;
	int huroken;
	int puruken;
	int niti;
	int ryo;
	int gokei;
	int wgokei;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		niti = sc.nextInt();
		for(int i=0;i<niti;i++){
			huro = sc.nextInt();
			puru = sc.nextInt();
			huroken = sc.nextInt();
			puruken = sc.nextInt();
			gokei = huro*huroken+puru*puruken;
			if(huroken<5){
				huroken = 5;
			}
			if(puruken<2){
				puruken = 2;
			}
			wgokei = (huro*huroken+puru*puruken)/10*8;
			if(gokei > wgokei){
				System.out.println(wgokei);
			}else{
				System.out.println(gokei);
			}
		}
	}
	public static void main(String[]args){
		Main obj = new Main();
		obj.solve();
	}
}