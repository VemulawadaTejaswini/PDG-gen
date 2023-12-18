import java.util.*;
class java0007{
    public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
        int value=100000;
	int n = scan.nextInt();
	int i;
	double tmp = 0;
	for(i=0;i<n;i++){
	    value *= 1.05;
	    tmp = value%1000;
	    value /= 1000;
	    if(tmp>0){
		value++;
	    }
	    value *= 1000;
	}
	System.out.println(value);
    }
}
	    