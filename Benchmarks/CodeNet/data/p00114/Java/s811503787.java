import java.util.Arrays;
import java.util.Scanner;




public class Main {

	Scanner sc;
	final int MAX=1<<15;
	
	int time(int a,int m){
		int x=1;
		for(int i=1;i<m;++i){
			if((x=(a*x)%m)==1){
				return i;
			}
		}
		return m;
	}
	
	int gcd(int a,int b){
		return a==0?b:gcd(b%a,a);
	}
	
	int lcm(int a,int b){
		return a/gcd(a,b)*b;
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in);
		
		while(true){
			int[] a=new int[3],m=new int[3],num=new int[3];
			boolean end=true;
			for(int i=0;i<3;++i){
				if((a[i]=ni())!=0|(m[i]=ni())!=0)end=false;
			}
			if(end)break;
			
			for(int i=0;i<3;++i)num[i]=time(a[i],m[i]);
			
			//debug(num);
			
			System.out.println(lcm(lcm(num[0],num[1]),num[2]));
		}
		sc.close();
	}
	
	void debug(Object...os){
		System.err.println(Arrays.deepToString(os));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}