import java.util.Scanner;
public class tiketto{
	int kin[]= {6000,4000,3000,2000};
	int t;
	int n;
	int go;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=3;i++){
			t = sc.nextInt();
			n = sc.nextInt();
			t = t-1;
			go = n*kin[t];
			System.out.println(go);
		}
	}
	public static void main(String[] args){
		tiketto obj = new tiketto();
		obj.solve();
	}
}