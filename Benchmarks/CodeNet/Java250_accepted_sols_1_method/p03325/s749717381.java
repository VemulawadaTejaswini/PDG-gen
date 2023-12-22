import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	int a=scan.nextInt();
    	int b[]=new int[a];
    	for(int i=0;i!=a;i++) {
    		b[i]=scan.nextInt();
    	}
    	int ans=0;
    	for(int i=0;i!=a;i++) {
    		if(b[i]%2==0) {
    			b[i]/=2;
    			ans++;
    			i=i-1;
    		}
    	}
    	System.out.println(ans);
    }
}