import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
			int hanako=0,tarou=0;
			for(int i=0;i<x;i++) {
				String str1=scan.next();
				String str2=scan.next();
				if(str1.compareTo(str2)>0) {
					tarou +=3;
				}else if(str1.compareTo(str2)<0) {
					hanako +=3;
				}else {
					hanako +=1;
					tarou +=1;
				}
			}
			System.out.println(tarou+" "+hanako);
			scan.close();
		}
}
