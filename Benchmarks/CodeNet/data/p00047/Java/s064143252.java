import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String str;
		String cupA, cupB;
		boolean[] cup = new boolean[3];
		cup[0] = true;
		while(scan.hasNext()){
			char[] a = scan.next().toCharArray();
			int s = a[0]-'A';
			int t = a[2]-'A';
			boolean b = cup[s];
			cup[s] = cup[t];
			cup[t] = b;
		}
		for(int i=0;i<3;i++){
			if(cup[i]){System.out.println((char)(i+'A'));break;}
		}
	}
}