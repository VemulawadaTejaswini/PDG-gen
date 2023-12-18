import java.util.Scanner;
public class Main {
	public static int mi(int a,int b) {
		int t=1;
		for(int i=0;i<b;i++) {
			t=a*t;
			System.out.print(t+" ");
		}
		if(b==0) {
			System.out.print(1);
		}
		return t;
	}
public static void main(String[] kotai) {
	Scanner a=new Scanner(System.in);
	while(a.hasNext()) {
	int x;
	x=a.nextInt();
	if(x==0) {
		break;
	}else{
		int sum=0;
for(int i=0;i<1000;i++) {
	for(int j=0;j<1000;j++) {
	sum=sum+x/mi(10,i)%10;
	}
}
System.out.println(sum);
}
	}
}
}
