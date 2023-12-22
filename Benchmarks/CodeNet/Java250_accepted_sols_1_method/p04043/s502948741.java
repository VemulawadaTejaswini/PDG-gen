import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int c5 = 0;
        int c7 = 0;
        
        if(a==5) {
        	c5++;
        }else {
        	c7++;
        }
        
        if(b==5) {
        	c5++;
        }else {
        	c7++;
        }
        
        if(c==5) {
        	c5++;
        }else {
        	c7++;
        }
        
        if(c5==2 && c7==1) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
	}
}