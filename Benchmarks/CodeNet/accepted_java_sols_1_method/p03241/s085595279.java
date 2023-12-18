import java.util.Scanner;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);long N=s.nextLong();long M=s.nextLong();long X=1;
for(int i=1; i*i<=M; i++){
if(M%i==0 && i*N<=M)X=Math.max(X,i);
if(M%(M/i)==0 && (M/i)*N<=M)X=Math.max(X,(M/i));
}
System.out.println(X);
}
}