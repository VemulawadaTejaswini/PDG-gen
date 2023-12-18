import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;
		String[] st;
		int[] a = new int[4];
		while(sc.hasNext()){
			str = sc.next();
			st = str.split(",",0);
			
			if(st[1].equals("A"))a[0]++;
			if(st[1].equals("B"))a[1]++;
			if(st[1].equals("AB"))a[2]++;
			if(st[1].equals("O"))a[3]++;
		}
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		}
}