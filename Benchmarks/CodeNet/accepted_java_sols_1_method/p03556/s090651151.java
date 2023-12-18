import java.util.*;
 
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
        int sl = 0;
        for(int i = 1; i * i <= num; i++){
            if(i * i <= num){
                sl = i * i;
            }
        }
        System.out.println(sl);
	}
}