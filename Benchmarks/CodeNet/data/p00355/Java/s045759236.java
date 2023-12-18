import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int N = sc.nextInt();
        int x=0;
        int s,f;
        
        for(int i=0;i<N;i++){
        	s = sc.nextInt();
        	f = sc.nextInt();
        	if((b>s) && (f>a)){
        		System.out.println(1);
        		x =1;
        		return;
        	}
        }
        System.out.println(0);
    }
}