import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=a%1000;
		if(b%100==0){
		    if(b>500)
		    {
		        System.out.println(1000-b);
		    }
		    else{
		        System.out.println(b);
		    }
		}
		else{
		    int c=b%100;
		    int d=b-c;
		    if(d>500){
		        System.out.println(1000-d);
		    }
		    else{
		        System.out.println(d);
		    }
		}
	}
}