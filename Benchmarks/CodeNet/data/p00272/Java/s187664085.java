import java.util.Scanner;

class Main{
        int tiket[]={0,6000,4000,3000,2000};
		int t,n,uriage;
    
    public void solve(){
        Scanner sc=new Scanner(System.in);
		
        for(int i=1;i<=4;i++){
		t=sc.nextInt();
		n=sc.nextInt();
	    uriage=tiket[t]*n;
		System.out.println(uriage);
        }
    }
	public static void main(String[]args){
		Main obj=new Main();
		obj.solve();
	}
}