import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int[] ary = new int[5];
    	ary[0]=sc.nextInt();
    	ary[1]=sc.nextInt();
    	ary[2]=sc.nextInt();
    	ary[3]=sc.nextInt();
    	ary[4]=sc.nextInt();
    	if((ary[2]+ary[4])<=ary[0]&&(ary[3]+ary[4])<=ary[1]&&ary[2]>=ary[4]&&ary[3]>=ary[4]){
    	    System.out.println("Yes");
    	}else{
    		System.out.println("No");
    	}
    }
}

