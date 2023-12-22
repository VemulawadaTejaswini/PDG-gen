import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
  		long ans=1;
        long c=1;
		while(a>1){
        	a=a/2;
            ans+=Math.pow(2,c);
            c++;
        }

    	System.out.println(ans);
    }
}