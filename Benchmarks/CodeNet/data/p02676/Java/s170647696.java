import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String str = sc.next();
		int len = str.length();
		if(len<=k) System.out.println(str);
		else{
			char[] ch = new char[len+3];
			char[] temp = str.toCharArray();
			for(int i=0;i<k;i++) ch[i]=temp[i];
			ch[k]='.';
			ch[k+1]='.';
			ch[k+2]='.';
			for(int i=0;i<k+3;i++) System.out.print(ch[i]);
			System.out.println();
		}
	}
}
