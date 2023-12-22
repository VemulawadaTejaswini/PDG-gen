import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    long n =s.nextLong();
	    long a =100;
	    int p =1;
	    long count =0;
	    long ii =0;
	    while(a<n){
	        ii = (a*p)/100;
	        a += ii;
	        count++;
        }
        System.out.println(count);
    }
}
