import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int min=754;
		int[] a=new int[s.length()-2];
		for(int i=0; i<s.length()-2; i++) {
			a[i]=Integer.parseInt(s.substring(i, i+3));
			min=Math.min(Math.abs(a[i]-753), min);
		}
		System.out.println(min);
	}
}
