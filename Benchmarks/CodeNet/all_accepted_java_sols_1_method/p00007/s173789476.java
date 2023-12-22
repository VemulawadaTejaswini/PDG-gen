import java.util.*;

public class Main{
    
    public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	int w = sc.nextInt();
	int det=100000;
	for(;w>0;w--){
	    det*=1.05;
	    if(det%1000!=0){
		det=((det/1000)+1)*1000;
	    }
	}
	System.out.println(det);
    }
}