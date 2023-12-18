import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			n=n>2000?4000-n:n;
			int a=1;
			int b=3;
			int c=3;
			for(int i=0;i<n;i++){
				a+=b;
				b+=c;
				if(i<998){
					c++;
				}else{
					c-=3;
				}
			}
			System.out.println(a);
		}
	}
}