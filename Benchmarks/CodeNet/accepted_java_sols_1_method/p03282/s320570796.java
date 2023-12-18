import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;
        String N=sc.next();
        long A = sc.nextLong();
        //int B = sc.nextInt();
        long count=A;
        int last=0;
        StringBuilder K=new StringBuilder();
        for(int i=0;i<N.length();i++) {
        	//System.out.println(N.charAt(i));
        	count-=Math.pow(Character.getNumericValue(N.charAt(i)), 500000000000000L);
        	if(count<=0) {
        		System.out.println(N.charAt(i));
        		break;}
        }
        //System.out.println(K);
        //System.out.println();
	}

}
