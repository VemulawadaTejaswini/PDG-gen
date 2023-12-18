import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
	String s=sc.next();
char []c=s.toCharArray();
for(int i=0;i<c.length;i++) {
	int n=(int)c[i];
	if(n>=65 && n<=90) {
		int n2=n+32;
		c[i]=(char)n2;
	}
	else if(n>=97 && n<=122) {
		int n2=n-32;
		c[i]=(char)n2;
	}
	System.out.print(c[i]);
}
}
}
}
