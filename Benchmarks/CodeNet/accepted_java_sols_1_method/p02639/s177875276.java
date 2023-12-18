import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int[] num = new int[5];
		for(int i=0;i<5;i++){
			num[i] = sc.nextInt();
          	if( num[i] != (i+1) ){
              System.out.println( (i+1) );
            }
		}
		//System.out.println(ans);    	
	}
}