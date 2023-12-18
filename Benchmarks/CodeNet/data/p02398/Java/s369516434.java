import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int[] ary =new int[3];
    	ary[0]=sc.nextInt();
    	ary[1]=sc.nextInt();
    	ary[2]=sc.nextInt();

    	int reg=0;
    	for(int i=ary[0];i<ary[1]+1;i++){
    		if(ary[2]%i==0){
    			reg++;
    		}
    	}
    	System.out.println(reg);
    }
}
