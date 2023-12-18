
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int reg=0;
    	boolean frag =false;
    	String[] aun = new String[n];
    	for(int i=0;i<n+1;i++){
    	    aun[i] = sc.next();
    	    if(aun[i].equals("A")){
    	    	reg++;
    	    }else if(aun[i].equals("Un")){
    	    	reg--;
    	    }
            if(reg<0){
            	break;
            }else if(i==n-1){
            	frag = true;
            }
    	}
    	if(frag==false){
    		System.out.println("NO");
    	}else{
    		System.out.println("YES");
    	}
    }
}
