    import java.util.HashSet;
    import java.util.Scanner;
     
    public class Main {
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int n = scan.nextInt();
    		HashSet<Long> list = new HashSet<Long>();
     
    		for(int i = 0;i < n;i++) {
    			list.add(scan.nextLong());
    		}
     
    		if(n != list.size()) {
    			System.out.println("NO");
    		}else {
    			System.out.println("YES");
    		}
    	}
    }