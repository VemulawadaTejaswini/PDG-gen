import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] n = new int[100];
		int[] x = new int[100];
		int[] k = new int[100];
		int i = 0;
		
		n[0] = 1;
		x[0] = 1;
		
		while(!(n[i]==0 && x[i]==0)){
			i++;
			n[i] = scan.nextInt();
			x[i] = scan.nextInt();
			k[i] = 0;
			
			for(int q=1; q<=n[i]; q++){
			for(int j=1; j<=n[i]-1; j++){
			for(int h=1; h<=n[i]-2; h++){
				if(q>j && j>h && q+j+h==x[i]){
					k[i]++;}}}}}
			
			for(int q=1; q<i; q++){
				System.out.println(k[q]);}
	}
}
