import java.util.*;
public class Main
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
    	int num[] = new int[3];
    	for(int i=0;i<3;i++){
    	num[i] = scanner.nextInt();
    	}
    	
    	Arrays.sort(num);
    	for(int i=0;i<3;i++){
    		if(i < 2){
    			System.out.print(num[i]);
    			System.out.print(" ");
    		}else{
    			System.out.println(num[i]);
    		}
    	}
    }
}