import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){

	    double t = sc.nextDouble()/9.8;
	    double y = 4.9 * t*t;

	    int ans = 0;
	    for(int i=1;; i++){
		int n1 = 5*(i-1)-5;
		int n2 = 5*i-5;
		if(y>n1 && y<=n2){ans = i; break;}
	    }

	    System.out.println(ans);
	}
    }
}