import java.util.Scanner;
public class Main{
	int syu;
	int zansyu[]=new int[100];
	int chaka;
	int gokei;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
	    syu = sc.nextInt();
	while(syu!=0){
		gokei = 0;
		for(int n=1;n<=syu;n++){
			zansyu[n]=sc.nextInt();
			if(zansyu[n]>2){
				gokei = gokei+1;
			}
		}
		chaka=1;
		for(int m=1;m<=syu;m++){
			if(zansyu[m]>0){
				chaka = chaka+1;
			}
		}
		if(chaka>1&&gokei>0){
			System.out.println(chaka);
		}else{
			System.out.println("NA");
		}
			syu = sc.nextInt();
	}
	}
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}