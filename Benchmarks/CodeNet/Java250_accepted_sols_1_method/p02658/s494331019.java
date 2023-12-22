import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n,f=0;
		BigInteger a[]=new BigInteger[100005];
		n=input.nextInt();
		BigInteger b=new BigInteger("1");
		BigInteger c=new BigInteger("1000000000000000000");
		BigInteger d=new BigInteger("0");
		for(int i=1;i<=n;i++){
			a[i]=input.nextBigInteger();
			if(a[i].equals(d)){
				f=2;
				break;
			}
		}
		if(f==2){
			System.out.println("0");
		}
		else{
			for(int i=1;i<=n;i++){
				b=b.multiply(a[i]);
				if(b.compareTo(c)>0){
					f=1;
					break;
				}
			}
			if(f==1){
			System.out.println("-1");
		}
			else{
			System.out.println(b);
		}
		}
		
		
	}


}
