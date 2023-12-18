import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp;
		int sum[]=new int[2],h[]=new int[2],m[]=new int[2],s[]=new int[2];
		while(sc.hasNext()){
			sum[0]=sum[1]=0;
			for(int i=0;i<2;i++){
				h[i]=sc.nextInt();
				m[i]=sc.nextInt();
				s[i]=sc.nextInt();
				sum[i]=h[i]*3600+m[i]*60+s[i];
			}
			temp=sum[1]-sum[0];
			System.out.print(temp/3600);
			temp%=3600;
			System.out.print(" "+temp/60);
			temp%=60;
			System.out.println(" "+temp);
		}

	}

}