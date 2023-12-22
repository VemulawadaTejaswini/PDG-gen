import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,k=1,t=1,x,y;
		int i=1,j=1;
		while(s.hasNext()){
			a=s.nextInt();
			b=s.nextInt();
			//
			k=a;t=b;
			while(true){
				if(k==t)
					break;
				if(k<t){
					k=a*i;
					i++;
				}
				if(t<k){
					t=b*j;
					j++;
				}
			}
			x=k;
			//
			i=1;j=1;k=a;t=b;
			while(true){
				if(k==t)
					break;
				if(t<k){
					i++;
					if(a%i==0){
					k=a/i;
					}
				}
				if(k<t){
					j++;
					if(b%j==0){
					t=b/j;
					}
				}
			}
			y=k;
			System.out.println(y+" "+x);
			i=1;j=1;k=1;t=1;
		}
	}
}