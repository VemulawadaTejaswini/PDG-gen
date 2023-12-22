import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[1000];
		int q = 0;
		String str = "1";
		
		while(!(str.equals("0"))){
			a[q] = 0;
			str = scan.nextLine();
			char[] CH = str.toCharArray();
			for(int i=0; i<CH.length; i++){
				a[q] += (int)CH[i] - 48;}
				q++;}
				
			for(int i=0; i<q-1; i++){
				System.out.println(a[i]);}
	}
}
