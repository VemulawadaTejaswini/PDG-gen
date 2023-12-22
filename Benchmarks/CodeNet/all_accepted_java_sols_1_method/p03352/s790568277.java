import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
int X=Integer.parseInt(nyuA);

int ans=1;

for(int b=2;b<=X;b++){
int power=b*b;
for(int p=2;;p++){
if(power>X)break;
ans=Math.max(ans,power);
power*=b;
}
}
System.out.println(ans);
}

}

