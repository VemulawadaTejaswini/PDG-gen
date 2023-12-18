import java.util.*;
public class Main {

    public static void main(String[] ano) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	double a =scan.nextDouble();
        	double b =scan.nextDouble();
        	int n =scan.nextInt();
        	double f =a/b;
        	//System.out.println(f);
        	int s=0;
        	for(int i=1;i<=n;i++){
        		s+=((f*Math.pow(10, i))%10);
        	}
        	System.out.println(s);
        }
   
}
}