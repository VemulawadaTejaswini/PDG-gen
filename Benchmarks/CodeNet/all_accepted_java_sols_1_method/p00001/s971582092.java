import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int max1=0, max2=0, max3=0;
	while(kbd.hasNext()){
	    int m = kbd.nextInt();
	    if(m > max1){
		max3 = max2;
		max2 = max1;
		max1 = m;
	    }
	    else if(m > max2){
		max3 = max2;
		max2 = m;
	    }
	    else if(m > max3){
		max3 = m;
	    }
	}
	System.out.println(max1);
	System.out.println(max2);
	System.out.println(max3);
    }
}

	    