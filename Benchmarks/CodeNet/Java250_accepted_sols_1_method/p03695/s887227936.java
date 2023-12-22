import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int color[] = new int[8];
        int free = 0;
        for(int i = 0; i < n; i++){
        	int num = sc.nextInt();
            if(num <= 399){
            	color[0] = 1;
            }else if(num <= 799){
            	color[1] = 1;
            }else if(num <= 1199){
            	color[2] = 1;
            }else if(num <= 1599){
            	color[3] = 1;
            }else if(num <= 1999){
            	color[4] = 1;
            }else if(num <= 2399){
            	color[5] = 1;
            }else if(num <= 2799){
            	color[6] = 1;
            }else if(num <= 3199){
            	color[7] = 1;
            }else{
            	free++;
            }
        }
        int count = 0;
        for(int i = 0; i < 8; i++){
        	count += color[i];
        }
        int max = count + free;
        int min = count;
        if(count == 0){
            min = 1;
        }
        System.out.println(min + " " + max);
    }
}