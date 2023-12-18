import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a<b&&b<c)
            System.out.println(a +""+ b +""+ c);
        else{
        	if(a<b&&c<a)
            System.out.println(c +""+ a +""+ b);
           	else{
        	    if(b<a&&a<c)
            System.out.println(b +""+ a +""+ c);
                else
                	if(b<a&&c<b)
            System.out.println(c +""+ b +""+ a);
                	else
                	System.out.println(b +""+ c +""+ a);
           	}
           	}
    }
}