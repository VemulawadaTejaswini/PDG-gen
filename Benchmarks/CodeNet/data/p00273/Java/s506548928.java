import java.util.Scanner;
class Main3{
	int N;
	int x,y,b,p;
	int cnt;
	int i,k;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		for(cnt=0; cnt<N; cnt++){
			x=sc.nextInt();
			y=sc.nextInt();
			b=sc.nextInt();
			p=sc.nextInt();
			
			if(b>=5 && p>=2){
				i=(x*4/5)*b;
				k=(y*4/5)*p;
				
				System.out.println(i+k);
			}else{
				i=x*b;
				k=y*p;
				
				System.out.println(i+k);
		
				
		
		}
		}
	}
	
	public static void main(String[]args){
		Main3 obj = new Main3();
		obj.solve();
		
	}
}