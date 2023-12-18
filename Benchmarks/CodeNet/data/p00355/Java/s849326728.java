import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),b=in.nextInt(),n=in.nextInt();
		boolean j=false;
		
		for(int i=0;i<n;i++){
			int s=in.nextInt(),f=in.nextInt();
			if((s<a || s>=b) && (f<=a || f>b))j=true;
			else j=false;
		}
		
		if(j)System.out.println(0);
		else System.out.println(1);
	}
}

