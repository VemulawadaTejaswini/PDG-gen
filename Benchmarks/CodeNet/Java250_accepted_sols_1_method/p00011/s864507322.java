import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
	int b=sc.nextInt();
	int []a=new int[b];
	for(int i=0;i<b;i++) {
		a[i]=i+1;
	}
	int s=sc.nextInt();
	for(int i=0;i<s;i++) {
		   String str = sc.next();
		   String Str[] = str.split(",");
		   int p = 0,q = 0;
		   for(int l =0;l<Str.length;l++) {
			   p=Integer.parseInt(Str[0])-1;
			   q=Integer.parseInt(Str[1])-1;
			//   System.out.println(p);
			  // System.out.println(q);
		   }
			int temp;
			temp=a[p];
			a[p]=a[q];
			a[q]=temp;

	/*	for(int k=0;k<b;k++) {
			System.out.println(a[k]);
		}*/
	}
	for(int i=0;i<b;i++) {
		System.out.println(a[i]);
	}
}
}
}
