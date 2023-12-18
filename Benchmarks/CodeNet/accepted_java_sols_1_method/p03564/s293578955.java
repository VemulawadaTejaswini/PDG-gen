import java.util.Scanner;
 
class Main {
    public static void main (String[] args){
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int k=sc.nextInt();
    	int now=1;
    	for (int i = 0; i < n; i++) {
		     now=Math.min(now+k,now*2);
    	}
    	
 System.out.println(now);
    	
    }
}