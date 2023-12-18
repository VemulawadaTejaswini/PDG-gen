import java.util.Scanner;

public class Main {

	static int p,q;
	static int amari[];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;cin.hasNext();){
			p=cin.nextInt();
			q=cin.nextInt();
			int cnt=0,x=0,y=0;
			boolean first=true;
			amari=new int[q+1];
			for(int i = 0;i<q+1;i++){
				amari[i]=-1;
			}
			
			for(;;){
				x=p/q;
				y=p%q;
				if(first){
					first=false;
				}
				else {
					System.out.print(x);
				}
				if(y==0)break;
				if(x==0){
					amari[y]=cnt++;
					p*=10;
				}
				else if(amari[y]!=-1){
					break;
				}
				else{
					amari[y]=cnt++;;
					p=y*10;
				}

			}
			System.out.println();
			if(amari[y]!=-1){
				for(int i = 0;i<amari[y];i++){
					System.out.print(" ");
				}
				for(int i = 0;i<cnt-amari[y];i++){
					System.out.print("^");
				}
				System.out.println();
			}
			
		}

	}

}