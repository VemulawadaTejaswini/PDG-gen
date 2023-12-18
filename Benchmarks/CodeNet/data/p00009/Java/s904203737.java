import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		int a=1,b=0,n=0,i=0,j=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=2;i<=n;i++){
			for(j=2;j<i;j++){
				if(i%j == 0)a=0;
			}
			if(a==1){
				b++;
			//	System.out.println("i="+i+"j="+j);
			}
			a =1;
		}
		System.out.println(b);
	}
	}
		