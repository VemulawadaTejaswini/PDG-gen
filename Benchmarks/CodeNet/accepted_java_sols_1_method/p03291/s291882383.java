import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long MOD=1000000007;
		Scanner sc = new Scanner(System.in);
		char[] S=sc.next().toCharArray();
		int N=S.length;
		long a=0,b=0,c=0,z=1;
		for(int i=0;i<N;i++){
			switch(S[i]){
			case 'A': a+=z; break;
			case 'B': b+=a; break;
			case 'C': c+=b; break;
			case '?': c=3*c+b; b=3*b+a; a=3*a+z; z*=3; break;
			}
			if(a>=MOD) a%=MOD;
			if(b>=MOD) b%=MOD;
			if(c>=MOD) c%=MOD;
			if(z>=MOD) z%=MOD;
			
		}
		System.out.println(c);
	}
}
