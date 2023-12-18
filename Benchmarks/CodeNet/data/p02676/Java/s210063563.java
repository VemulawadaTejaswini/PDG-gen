    import java.util.Scanner;
    
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		// 整数の入力
    		int a = sc.nextInt();
    		String b = sc.next();
    		
    		if(a>=b.length()) {
    			System.out.println(b);
    		}else {
    			System.out.println(b.substring(0,a)+"...");
    		}
    	}
    }