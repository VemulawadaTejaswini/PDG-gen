import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),q=sc.nextInt();
    String s=sc.next();
    long[] a=new long[n+1];
    for(int i=2;i<=s.length();i++) {
    	if(s.substring(i-2, i).equals("AC"))a[i]=a[i-1]+1L;
    	else a[i]=a[i-1];
    }

    for(int i=0;i<q;i++) {
    	int l=sc.nextInt(),r=sc.nextInt();
    	System.out.println(a[r]-a[l]);
    }
  }
}
