import java.util.*;
public class Main {

 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	String nine="090909";
	int loga=(int)Math.log10(a);
	if(loga%2==1){
		 System.out.println(Integer.parseInt(nine.substring(0,(loga+1))));
	}else{
		int f=0;
		if(loga>0)f=Integer.parseInt(nine.substring(0,loga));
		System.out.println((int)(f+(a-Math.pow(10,loga)+1)));
	}
 }
}
