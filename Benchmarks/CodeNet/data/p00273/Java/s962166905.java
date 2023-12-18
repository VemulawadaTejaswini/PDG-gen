import java.util.Scanner;
public class Main{
    int niti;
	int purune;
	int hurone;
	int purumai;
	int huromai;
	int ryo;
	int gokei;
	int wgokei;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		niti = sc.nextInt();
		for(int i=0;i<niti;i++){
			hurone = sc.nextInt();
			purune = sc.nextInt();
			huromai = sc.nextInt();
			purumai = sc.nextInt();
			gokei = hurone*huromai+purune*purumai;
			if(huromai<5){
				huromai = 5;
			}
			if(purumai<2){
				purumai = 2;
			}
			wgokei = (hurone*huromai+purune*purumai)/10*8;
			if(gokei > wgokei){
				System.out.println(wgokei);
			}else{
				System.out.println(gokei);
			}
		}
	}
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}