import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N[] = new int[4];
		for(int n=0;n<4;n++){
			N[n] = sc.nextInt();
		}
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		for(int n=0;n<4;n++){
			if(N[n]==1){
				a=true;
			}
			if(N[n]==9){
				b=true;
			}
			if(N[n]==7){
				c=true;
			}
			if(N[n]==4){
				d=true;
			}
		}
		if(a&&b&&c&&d){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}

	}
}