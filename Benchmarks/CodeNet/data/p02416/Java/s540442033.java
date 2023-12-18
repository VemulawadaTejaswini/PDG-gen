import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,i,sum;
        String str;
        while(true) {
        	sum=0;
        	str=scan.next();
        	n=str.length();
        	for(i=0;i<n;i++) {
        		sum+=Character.getNumericValue(str.charAt(i));
        	}
        	if(sum==0) {
        		break;
        	}
        	else {
        		System.out.println(sum);
        	}
        }
    }
}
