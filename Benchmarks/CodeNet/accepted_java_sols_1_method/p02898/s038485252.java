import java.util.*;
 
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
    	int friends = sc.nextInt();
        int height = sc.nextInt();
        int fh[] = new int[friends];
        int count = 0;
        for(int i = 0; i < friends; i++){
        	fh[i] = sc.nextInt();
            if(fh[i] >= height){
            	count++;
            }
        }
        System.out.println(count);
	}
}