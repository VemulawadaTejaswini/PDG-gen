import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;
        int A = sc.nextInt();
        boolean flag=true;
        int check=0;
        int j=0;
        int[] N=new int[A];
        for(int i=0;i<A;i++) {
        	 N[i]=sc.nextInt();
        }
        while(flag==true) {
        	if(N[j]%2==0) {N[j]/=2;check++;}
        	else {j++;if(j>=A) {flag=false;}}

        }
        System.out.print(check);
	}

}
