import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		int b=sc.nextInt();
		int []a=new int[b];
		for(int i=0;i<b;i++) {
			a[i]=i+1;
			//System.out.print(a[i]);
		}//
		int s=sc.nextInt();
		for(int i=0;i<s;i++) {
			   String str = sc.next();
			   String Str[] = str.split(",");
				 int p=Integer.parseInt(Str[0])-1;
				 int q=Integer.parseInt(Str[1])-1;	
				int temp;
				temp=a[p];
				a[p]=a[q];
				a[q]=temp;
		}
			for(int j=0;j<b;j++) {
				System.out.println(a[j]);
			}
	}
	}
	}
