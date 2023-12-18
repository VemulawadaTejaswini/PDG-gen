import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n;
		int pm, pe, pj;
		String[] s;
		
		while(true){
			n = scan.nextInt();
			if(n == 0)break;
			
			s = new String[n];
			for(int i = 0; i < n; i++){
				pm = scan.nextInt();
				pe = scan.nextInt();
				pj = scan.nextInt();
				
				if(pm == 100 || pe == 100 || pj == 100)s[i] = "A";
				else if((pm + pe) / 2 >= 90)s[i] = "A";
				else if((pm + pe + pj) / 3 >= 80)s[i] = "A";
				else if((pm + pe + pj) / 3 >= 70)s[i] = "B";
				else if((pm + pe + pj) / 3 >= 50 && (pm >= 80 || pe >= 80))s[i] = "B";
				else s[i] = "C";
			}
			for(int i = 0; i < n; i++){
				System.out.println(s[i]);
			}
		}
	}
}