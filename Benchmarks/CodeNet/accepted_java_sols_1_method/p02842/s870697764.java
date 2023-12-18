import java.util.*;
 
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int o=0;
      	String s;
      	int n2=(int)(n/1.08);
      	if((int)(n2*1.08)==n)o=n2;
      	if((int)((n2+1)*1.08)==n)o=n2+1;
      	if(o==0)s=":(";
      	else s=Integer.toString(o);
      	System.out.println(s);
    }
}