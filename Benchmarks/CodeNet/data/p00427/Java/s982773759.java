import java.util.*;
import java.math.*;
class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			int a=s.nextInt();
			int b=s.nextInt();
			int c=s.nextInt();
			int d=s.nextInt();
			if(a+b+c+d==0)System.exit(0);
			if(c==0){
				if(a==1)System.out.print("1.");
				else System.out.print("0.");
				int now=1;
				if(a==1)now=0;
				for(int i=0;i<d;i++){
					now*=10;
					System.out.print(now/a);
					now%=a;
				}
				System.out.println();
			}else{
				BigInteger kaijo=new BigInteger("1");
				for(int i=1;i<a;i++)kaijo=kaijo.multiply(new BigInteger(""+i));
				BigInteger bunbo=kaijo.multiply(new BigInteger(""+a));
				BigInteger bunshi=BigInteger.ZERO;
				for(int i=1;i<=a;i++){
					bunshi=bunshi.add(kaijo.divide(new BigInteger(""+Math.max(1,i-1))));
				}
				if(a<3)System.out.print("1.");
				else System.out.print("0.");
				if(a<3)bunshi=BigInteger.ZERO;
				for(int i=0;i<d;i++){
					bunshi=bunshi.multiply(new BigInteger(""+10));
					System.out.print(bunshi.divide(bunbo).toString());
					bunshi=bunshi.mod(bunbo);
				}
				System.out.println();
			}
		}
	}
}