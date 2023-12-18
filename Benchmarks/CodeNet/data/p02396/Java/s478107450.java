import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int[] ary =new int[10000];
    	Arrays.fill(ary,1);
    	int i=0;
    	for(;;i++){
    		ary[i]=Integer.parseInt(sc.next());
    		if(ary[i]==0){
    			break;
    		}
    		System.out.println("Case "+(i+1)+": "+ary[i]);
    	}
    	
    }
}
