import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int min;
        int d;
        min = scan.nextInt();
    	int tmp = scan.nextInt();
    	d = tmp - min;
    	if(tmp < min){
    		min = tmp;
    	}
        //max = min;
        for(int i = 1; i < n-1; i++){
            int x = scan.nextInt();
            if(x < min){
                min = x;
            }else{
            	tmp = x - min;
            	if(d < tmp){
            		d = tmp;
            	}
            }
        }
        System.out.println(d);
    }
}
