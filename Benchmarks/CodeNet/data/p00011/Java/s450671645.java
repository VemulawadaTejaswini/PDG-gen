import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
	int b=sc.nextInt();
	int []a=new int[b];
	for(int i=0;i<a.length;i++) {
		a[i]=i+1;
	//System.out.print(a[i]);
	}
	int s=sc.nextInt();//交换的次数
	for(int i=0;i<s;i++) {
		int p=sc.nextInt();//输入交换的数字
		int q=sc.nextInt();//输入交换的数字
		p=p-1;
		q=q-1;
	//	System.out.printf("%d,%d",p,q);
		for(int j=0;j<a.length;j++) {
			int temp;
			temp=a[p];
			a[p]=a[q];
			a[q]=temp;
		}
	/*	for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}*/
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}
}
