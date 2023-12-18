import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] m = new int[51];
		int[] f = new int[51];
		int[] r = new int[51];
		int[] sum = new int[51];
		int i = 0;
		
		while(!(m[i]==-1 && f[i]==-1 && r[i]==-1)){
			i++;
			m[i] = scan.nextInt();
			f[i] = scan.nextInt();
			r[i] = scan.nextInt();
			sum[i] = m[i] + f[i];
		}
		
		for(int q=1; q<i; q++){
			if(m[q]==-1 || f[q]==-1){
				System.out.println("F");}
			else if(sum[q]>=80){
				System.out.println("A");}
			else if(sum[q]>=65){
				System.out.println("B");}
			else if(sum[q]>=50){
				System.out.println("C");}
			else if(sum[q]>=30){
				if(r[q]>=50){
					System.out.println("C");}
				else{
					System.out.println("D");}}
			else{
				System.out.println("F");}}
	}
}
