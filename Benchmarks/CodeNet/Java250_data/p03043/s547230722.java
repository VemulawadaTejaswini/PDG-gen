import java.util.Scanner;
//2-3
public class Main{
    public static void main(String [] args){
    	Scanner scan=new Scanner(System.in);
    	int n=scan.nextInt();
    	int k=scan.nextInt();
    	int a=0;
    	int b=0;
    	double c=0;
    	double ans=0;
    	for(int i=1;i<=n;i++){
    		a=i;
    		while(a<k) {
    			a*=2;
    			b++;
    		}
    		c=n*Math.pow(2, b);
    		ans+=1/c;
    		//System.out.println(c);
    		a=0;
    		b=0;
    		c=0;
    	}
    	System.out.println(ans);
    }
}