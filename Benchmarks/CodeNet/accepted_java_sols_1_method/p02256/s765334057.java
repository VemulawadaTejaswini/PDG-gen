import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();
        int m =sc.nextInt();
        int r;
        for(;;){
            r=n%m;
            if(r==0){
            	System.out.println(m);
            	break;
            }
            n=m;
            m=r;
        }

    }
}
