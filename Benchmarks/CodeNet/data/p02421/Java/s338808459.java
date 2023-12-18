import java.util.Scanner;

class Main {
	public static void main(String args[]){	
		Scanner scan = new Scanner(System.in);
				
		int n, ap, bp, a;
		String str, str2;
		
		ap = 0;
		bp = 0;
		
		n = scan.nextInt();
		for(int i = 0; i < n; i++){
			str = scan.next();
			str2 = scan.next();
			
			a = str.compareTo(str2);
			
			if(a > 0){
				ap += 3;
			}else if(a == 0){
				ap++;
				bp++;
			}else{
				bp += 3;
			}
			
		}
			System.out.println(ap + " " + bp);
	}
}