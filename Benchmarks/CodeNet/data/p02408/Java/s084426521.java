import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,no,ma;
		int n=sc.nextInt();
		int[] rauzu=new int[55];
		for(x=1;x<=n;x++){
			String mar=sc.next();
			if(mar=="S"){ma=0;
		}else if(mar=="H"){ma=13;
		}else if(mar=="C"){ma=26;}
		else{ma=39;}
		no = sc.nextInt();
		rauzu[no+ma]=1;
		}
		for(x=1;x<=54;x++){
			if(rauzu[x]!=1){
				if(x<=13){System.out.println("S "+x);}
				else if(x<=26){System.out.println("H "+(x-13));}
				else if(x<=39){System.out.println("C "+(x-26));}
				else System.out.println("H "+(x-39));
			}
		}
		}
}