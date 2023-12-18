import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt(),w=sc.nextInt();
		int ansh=0,answ=0;
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(sc.next().equals("snuke")) {
					ansh=i+1;
					answ=j;
				}
			}
		}
		System.out.println((char)(65+answ)+""+ansh);
		//char a='A';
		//System.out.println(Integer.valueOf(a));
	}
}

