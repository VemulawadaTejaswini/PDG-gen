import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        int count=0;
        for(int i=1;i<1000001;i++) {
        	if(i%7!=0) {
        		c-=a;
        		count++;
        	}else {
        		c-=a;
        		c-=b;
        		count++;
        	}
        	
        	if(c<=0)break;
        }
        System.out.println(count);

	}
}

