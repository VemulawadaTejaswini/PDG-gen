import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n=s.length();
		String a=s.substring(0,(n-1)/2);
		String b=s.substring((n-1)/2+1);
		String c;
		String d;
      	int m=a.length();
		if(m%2==0){
			c=a.substring(0,m/2);
          	d=a.substring(m/2);
		}else{
			c=a.substring(0,(m-1)/2);
          	d=a.substring((m-1)/2+1);
		}
      	String br=new StringBuffer(b).reverse().toString();
      	String dr=new StringBuffer(d).reverse().toString();
		if(a.equals(br)&&c.equals(dr)){
    	  System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}
}
