import java.util.Scanner;
public class Main{
	int kin[]={6000,4000,3000,2000};
	int syu;
	int mai;
	int gokei;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=3;i++){
			syu = sc.nextInt();
			mai = sc.nextInt();
			syu = syu-1;
			gokei = mai*kin[syu];
			System.out.println(gokei);
		}
	}
	
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}