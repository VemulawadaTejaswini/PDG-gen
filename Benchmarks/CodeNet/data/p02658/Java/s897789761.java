import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
String s=sc.nextLine();
int d=Integer.parseInt(s);
	String[] a=sc.nextLine().split(" ");
BigInteger hn=new BigInteger(1+"");
for(String h:a){
BigInteger nn=new BigInteger(h+"");
hn=hn.multiply(nn);
}
BigInteger kn=new BigInteger(1000000000+"");
kn=kn.multiply(kn);

if(kn.compareTo(hn)==-1){
System.out.println("-1");
}else if(kn.compareTo(hn)==1){
System.out.println(hn.toString());
}else{
System.out.println(hn.toString());

}

    }

}