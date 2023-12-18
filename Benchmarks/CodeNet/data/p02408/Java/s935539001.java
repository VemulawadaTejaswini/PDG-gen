import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),x,no,ma;
		int[] rauzu=new int[n];
		for(x=0;x<=n;x++){
		String mar=sc.toString();
		if(mar=="S"){ma=0;
		}else if(mar=="H"){ma=1;			
		}else if(mar=="C"){ma=2;}
		else{ma=3;}
		no = sc.nextInt();
		rauzu[no+13*ma]=1;
		}
		for(x=1;x<=54;x++){
			if(rauzu[x]==0){
				if(rauzu[x]>=13){System.out.print("S "+x);}
				else if(rauzu[x]>=26){System.out.print("H "+(x-13));}
				else if(rauzu[x]>=39){System.out.print("C "+(x-26));}
				else System.out.print("H "+(x-39));
			}
		}
		System.out.println("");
		}
}