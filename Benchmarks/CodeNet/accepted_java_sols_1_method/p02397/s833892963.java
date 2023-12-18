import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int[] ary =new int[2];
    	for(;;){
    		ary[0]=sc.nextInt();
    		ary[1]=sc.nextInt();
    		if(ary[0]==0&&ary[1]==0){
    			break;
    		}
    		Arrays.sort(ary);
    		System.out.println(ary[0]+" "+ary[1]);
    	}
    	
    }
}
