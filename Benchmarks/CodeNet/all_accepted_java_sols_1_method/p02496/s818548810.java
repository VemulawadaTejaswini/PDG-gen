import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), x = 0;
		int sn[] = new int[13];
		int cn[] = new int[13];
		int hn[] = new int[13];
		int dn[] = new int[13];
		String S = "S";
		for(int i = 0; i < 13; i++){
			sn[i] = 0;
			cn[i] = 0;
			hn[i] = 0;
			dn[i] = 0;
		}
		for(int i = 0; i < n; i++){
			S = sc.next();
			if(S.equals("S")){
				x = sc.nextInt();
				sn[x-1] = 1;
			} else if(S.equals("C")){
				x = sc.nextInt();
				cn[x-1] = 1;
			} else if(S.equals("H")){
				x = sc.nextInt();
				hn[x-1] = 1;
			} else if(S.equals("D")){
				x = sc.nextInt();
				dn[x-1] = 1;
			}
		}
		for(int i = 0; i < 13; i++){
			if(sn[i] == 1){	
			} else {
				System.out.println("S "+(i+1));
			}
		}
		for(int i = 0; i < 13; i++){
			if(hn[i] == 1){	
			} else {
				System.out.println("H "+(i+1));
			}
		}
		for(int i = 0; i < 13; i++){
			if(cn[i] == 1){	
			} else {
				System.out.println("C "+(i+1));
			}
		}
		for(int i = 0; i < 13; i++){
			if(dn[i] == 1){	
			} else {
				System.out.println("D "+(i+1));
			}
		}
	}
}