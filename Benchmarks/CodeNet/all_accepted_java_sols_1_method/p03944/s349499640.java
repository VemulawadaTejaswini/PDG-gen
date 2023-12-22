import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int l = 0;
		int r = w;
		int u = h;
		int d = 0;
		for(int  i = 0;i < n;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			if(a == 1){
				l = Math.max(l, x);
			}else if(a == 2){
				r = Math.min(r, x);

			}else if(a == 3){
				d = Math.max(d, y);

			}else if(a == 4){
				u= Math.min(u,y);
			}
		}
		
		
		
		if((l >= r && (r != 0) ) ||( d >= u)  && (u != 0) ){
			System.out.println(0);
		}else{
			System.out.println( (u-d) * (r-l)   );
		}
		
		
				
	}
}