import java.math.*;
import java.util.*;
class Main{
	public static void main(String[] args){
		String lis[]={"","Man","Oku","Cho","Kei","Gai","Jo","Jou","Ko","Kan","Sei","Sai","Gok",
		"Ggs","Asg","Nyt","Fks","Mts"};
		BigInteger[] val=new BigInteger[18];
		val[0]=BigInteger.ONE;
		for(int i=1;i<18;i++)val[i]=val[i-1].multiply(new BigInteger("10000"));
		Scanner s=new Scanner(System.in);
		while(true){
			BigInteger a=s.nextBigInteger();
			int b=s.nextInt();
			if(b==0){
				break;
			}
			BigInteger ret=BigInteger.ONE;
			for(int i=0;i<b;i++)ret=ret.multiply(a);
			for(int i=17;i>=0;i--){
				BigInteger ks=ret.divide(val[i]);
				ret=ret.remainder(val[i]);
				if(!ks.equals(BigInteger.ZERO))System.out.print(ks.toString()+lis[i]);
			}
			System.out.println();
		}
	}
}