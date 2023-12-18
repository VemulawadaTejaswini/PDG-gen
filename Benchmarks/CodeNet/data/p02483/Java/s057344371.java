import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int min=a;
		int max=a;
		int ans=a;
		if(a>b){
			if(b>c){
				min=c;
				ans=b;
				max=a;
			}else if(c>b){
				if(a>c){
					min=b;
					ans=c;
					max=a;
				}else{
					min=b;
					ans=a;
					max=c;
				}
			}
		}else if(a>c){
			min=c;
			ans=a;
			max=b;
		}else if(c>a){
			if(b>c){
				min=a;
				ans=c;
				max=b;
			}else{
				min=a;
				ans=b;
				max=c;
			}
		}
		System.out.println(min+" "+ans+" "+max);
		
		// TODO Auto-generated method stub

	}

}