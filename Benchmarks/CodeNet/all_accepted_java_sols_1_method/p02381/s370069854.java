import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat( "0.00000000 ");  
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		float sum=0;
		float sum2=0;
		float a = 0;
	int n=sc.nextInt();
	if(n==0) {
		break;
	}
	int s[]=new int[n];
	for(int i=0;i<s.length;i++) {
		s[i]=sc.nextInt();
	}
	for(int i=0;i<s.length;i++) {
		sum=sum+s[i];
	}
	float m=sum/n;
	for(int i=0;i<s.length;i++) {
			a=(s[i]-m)*(s[i]-m);
			sum2=sum2+a;
	}
	float a2=sum2/n;
	float a3=(float)Math.sqrt(a2);
	System.out.println(df.format(a3));
}
}
}
