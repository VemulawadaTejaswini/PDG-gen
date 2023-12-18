import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){

        int a=0, b=0, t=0;
        boolean flag=true;
        for(int i=0; i<10; i++){
        	t=sc.nextInt();
        	if(a<t)	a=t;
        	else if(b<t) b=t;
        	else flag=false;
        	}

        if(true==flag) System.out.println("YES");
        else System.out.println("NO");

    }
    }
}