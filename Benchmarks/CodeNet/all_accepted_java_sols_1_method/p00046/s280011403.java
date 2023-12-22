import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	double h=0,l=0;
	while(true){
		if(!cin.hasNext()){
			break;
		}
		double x;
		x=cin.nextDouble();
		if(l==0){
			l=x;
		}
		if(x>=h){
			h=x;
		}
		if(l>=x){
			l=x;
		}
	}
	System.out.println(h-l);
	}
}