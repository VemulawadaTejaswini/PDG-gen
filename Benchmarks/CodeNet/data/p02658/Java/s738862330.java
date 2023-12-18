    import java.util.Scanner;
    
    public class Main {
    	public static void main(String[] args){
    		Scanner scan = new Scanner(System.in);
    		int a = scan.nextInt();
    		long []b = new long[a]; 
    		long ans=1;
    		for(int i=0;i<a;i++) {
    			b[i]=scan.nextLong();
    			ans=ans*b[i];
    		}
    		
    		if(ans>1000000000000000000l) {
    			System.out.println("-1");
    		}else {
    		System.out.println(ans);
    		}

    	}
    }