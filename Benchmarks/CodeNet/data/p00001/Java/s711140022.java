import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,c =0;
		int[] n= new int[10];
		for(int i=0;i<10;i++){
			n[i]=sc.nextInt();
			if(n[i]>a){
				c=b;
				b=a;
				a=n[i];
			}else if(n[i]>b){
				c=b;
				b=n[i];
			}else if(n[i]>c){
				c=n[i];
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}