    import java.util.Scanner;
    
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		// 整数の入力
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		double c = sc.nextDouble();
    		double d = sc.nextDouble();
    		double kaku = 0;
    		double answer = 0;
    		
    		
    		c=30*c+0.5*d;
    		d=6*d;
    		if(c>d) {
    			kaku=c-d;
    		}else {
    			kaku=d-c;
    		}
    		kaku=Math.cos(Math.toRadians(kaku));
    		
    		answer=a*a+b*b-2*a*b*kaku;
    		System.out.println(Math.sqrt(answer));
    		
    	}
    }