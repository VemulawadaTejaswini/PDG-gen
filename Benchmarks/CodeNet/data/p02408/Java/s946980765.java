import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,no,ma;
		int n=sc.nextInt();
		int[] rauzu=new int[53];
		for(x=1;x<=n;x++){
			String mar=sc.next();
			if(mar=="S"){ma=0;
		}else if(mar=="H"){ma=13;
		}else if(mar=="C"){ma=26;}
		else{ma=39;}
		no = sc.nextInt();
		rauzu[no+ma]=1;
		}
		for(x=1;x<=52;x++){
			if(rauzu[x]!=1){
				if(1<=x&&x<=13){System.out.println("S "+x);}
				else if(14<=x&&x<=26){System.out.println("H "+(x-13));}
				else if(27<=x&&x<=39){System.out.println("C "+(x-26));}
				else if(40<=x&&x<=53){System.out.println("H "+(x-39));}
			}
		}
		}
}