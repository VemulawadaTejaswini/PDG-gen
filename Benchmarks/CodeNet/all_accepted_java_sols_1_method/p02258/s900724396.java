import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		int n,min=0,a,p=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (int i=0;i<n;i++){
			a=sc.nextInt();
			if (i>=2){
				if (a-min>p){p=a-min;}
				if (a<min){min=a;}
			}else if (i==0){
				min=a;
			}else if (i==1){
				p=a-min;
				if (a<min){min=a;}
			}
		}
		System.out.println(p);
	}
}