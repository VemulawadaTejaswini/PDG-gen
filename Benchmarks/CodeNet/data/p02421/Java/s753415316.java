import java.util.Scanner;

class Main
{
	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
	
	int ak = 0, bk = 0;
	int a, b, j, w, u;
	
	int kai = scan.nextInt();
	
	for(int i=0; i<kai; i++){
		String stra = scan.next();
		String strb = scan.next();
		
		char[] A = stra.toCharArray();
		char[] B = strb.toCharArray();
		
		int x = 0;
		int c = 0;
		
		for(j=0; j<A.length; j++){}
		for(w=0; w<B.length; w++){}
		
		if(j < w){
			u = j;}
		else{
			u = w;}
		
		for(int q=0; q<u; q++){
			a = A[q];
			b = B[q];
			
			if(a < b){
				bk += 3;
				c = 1;
				break;}
			else if(a > b){
				ak += 3;
				c = 1;
				break;}}

			if(c == 0){
				if(j == w){
					ak++;	bk++;}
				else if(j > w){
					ak += 3;}
				else{
					bk += 3;}}}
				
		System.out.println(ak+" "+bk);
	}
}
