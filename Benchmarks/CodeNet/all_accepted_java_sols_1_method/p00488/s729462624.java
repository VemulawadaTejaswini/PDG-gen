import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int pmin = Integer.MAX_VALUE;
	int jmin = Integer.MAX_VALUE;
	for(int i=0; i<3; i++){
	    int p = sc.nextInt();
	    if(p<pmin)pmin = p;
	}
	for(int i=0; i<2; i++){
	    int j = sc.nextInt();
	    if(j<jmin)jmin = j;
	}

	System.out.println(pmin+jmin-50);
    }
}