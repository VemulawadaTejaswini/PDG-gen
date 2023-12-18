import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	String a=scan.next();
    	int ans=0;
    	for(int i=0;i!=6;i++) {
    	if(a.charAt(i)=='1') {
    		ans++;
    	}
    	}
    	System.out.println(ans);
    }
}