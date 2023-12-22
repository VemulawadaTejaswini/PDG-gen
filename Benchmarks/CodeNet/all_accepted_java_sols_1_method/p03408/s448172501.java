import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	String A[]=new String[a];
	int ans=0;
	for(int i=0;i<a;i++) {
		A[i]=scan.next();
	}
	int b=scan.nextInt();
	String B[]=new String[b];
	for(int i=0;i<b;i++) {
		B[i]=scan.next();
	}
	for(int i=0;i<a;i++) {
		String str=A[i];
		int count=0;
		for(int j=0;j<a;j++) {
			if(str.equals(A[j])) {
				count++;
			}
		}
		for(int j=0;j<b;j++) {
			if(str.equals(B[j])) {
				count--;
			}
		}
		if(count>ans) {
			ans=count;
		}
	}
	System.out.println(ans);
	scan.close();
}
}