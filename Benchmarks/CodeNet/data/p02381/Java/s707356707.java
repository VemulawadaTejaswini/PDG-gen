import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		double sum=0;
		double sum2=0;
		double a = 0;
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
	double m=sum/n;
	for(int i=0;i<s.length;i++) {
			a=(s[i]-m)*(s[i]-m);
			sum2=sum2+a;
	}
	double a2=sum2/n;
	double a3=(double) Math.sqrt(a2);
	System.out.println(a3);
}
}
}

