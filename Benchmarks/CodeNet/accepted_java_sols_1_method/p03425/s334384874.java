import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//System.out.println(N);
		long m=0;
		long a=0;
		long r=0;
		long c=0;
		long h=0;
		for(int i =0;i<N;i++){
			String str=sc.next();
			//System.out.println(hoge);
			if(str.startsWith("M")){
				//System.out.println("M");
				m++;
			}else if(str.startsWith("A")){
				a++;
				//System.out.println("A");
			}else if(str.startsWith("R")){
				r++;
				//System.out.println("R");
			}else if(str.startsWith("C")){
				c++;
				//System.out.println("C");
			}else if(str.startsWith("H")){
				h++;
				//System.out.println("H");
			}
		}
		long ans=0;
		ans = m*(a*(r+c+h)+r*(c+h)+c*h)+a*(r*(c+h)+c*h)+r*c*h;
		System.out.println(ans);
		sc.close();
	}
}
