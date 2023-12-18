import java.util.*;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int keta;
    	double num[] = new double[2];

    	for (int i=0;i<201;i++){
	    	num[0]=(double)sc.nextInt();
	    	num[1]=(double)sc.nextInt();
    		keta = (int)Math.log10(num[0]+num[1]);
    		System.out.println(keta+1);
    	}
   	}
}

