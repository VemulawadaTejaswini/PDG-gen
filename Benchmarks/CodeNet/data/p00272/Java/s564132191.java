import java.util.Scanner;
class Main{
	int t;
	int n;
	int cnt=0;
	
	public void solve(){
    Scanner sc=new Scanner(System.in);
		
		while(cnt<4){
			t=sc.nextInt();
			n=sc.nextInt();
        if(t==1){
			System.out.println(6000*n);
			cnt++;
        }else if(t==2){
			System.out.println(4000*n);
			cnt++;
        }else if(t==3){
			System.out.println(3000*n);
			cnt++;
		}else{
			System.out.println(2000*n);
			cnt++;
        }
		}
	}
	public static void main(String[] args){
        Main obj =new Main();
        obj.solve();
    }
}