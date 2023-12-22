import java.util.*;
public class Main {
	public static void main(String[] args){
    	int x=0;
        int b;
    	Scanner sc = new Scanner(System.in);
    	String a = sc.next();
    	String data[] = a.split("");
      		for(int i= 0; i < data.length; i++){
                b=Integer.parseInt(data[i]);
      			if(b==1){
        			x=x+1;
      			}
    		}
    System.out.println(x);
    }
}