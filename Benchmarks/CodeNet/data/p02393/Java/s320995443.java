import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int[] ary = new int[3];
    	ary[0]=sc.nextInt();
    	ary[1]=sc.nextInt();
    	ary[2]=sc.nextInt();
    	Arrays.sort(ary);
    	for(int i=0;i<3;i++)System.out.print(ary[i]);
    }
}

