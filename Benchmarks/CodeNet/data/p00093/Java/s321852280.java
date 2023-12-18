import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b,c,i,y[]=new int[750];
		a=sc.nextInt();
		b=sc.nextInt();
		while(true){
			c=0;
			if(a==0 && b==0) break;
			for(i=a;i<=b;i++){
				if(i%4==0 && (i%100!=0 || i%400==0)){
					y[c++]=i;
				}
			}
			if(c>0){
				for(i=0;i<c;i++)
					System.out.println(y[i]);
			}
			else{
				System.out.println("NA");
			}
			a=sc.nextInt();
			b=sc.nextInt();
			if(a!=0 && b!=0)
			System.out.println("");
		}//
	}
}