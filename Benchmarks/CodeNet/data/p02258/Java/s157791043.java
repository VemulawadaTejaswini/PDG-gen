import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();
    	int[] ary =new int[n];
    	int i,reg=0;
    	for(i=0;i<n;i++){
    		ary[i]=sc.nextInt();
    		if(i==1){
    			reg=ary[1]-ary[0];
    		}
    		for(int j=0;j<i;j++){
    			if(ary[i]-ary[j]>reg){
    				reg=ary[i]-ary[j];
    			}
    		}
    	}
    	System.out.println(reg);

    }
}
