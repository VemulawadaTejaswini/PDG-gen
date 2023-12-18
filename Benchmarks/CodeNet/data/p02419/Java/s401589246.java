import java.util.Scanner;
public class Main {
	public static int shu(String a,String b) {
			int indexStart=0;
			int alength=a.length();
			int count=0;
			while(true) {
				int t=b.indexOf(a,indexStart);
			if(t>=0) {
				count++;
				indexStart=t+alength;
			}else {
					break;
			}
		}
		return count;
	}
public static void main(String[] kotai) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
	String a=sc.nextLine();
	String A = a.toLowerCase();
	String b=sc.nextLine();
	String B = b.toLowerCase();
	if(B=="END_OF_TEXT") {
		break;
	}else {
int c=shu(A,B);
System.out.println();
System.out.println(c);
	}
	}
	sc.close();
}
}

