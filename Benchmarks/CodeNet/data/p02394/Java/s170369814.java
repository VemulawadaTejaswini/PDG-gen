import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        
    	int w = sc.nextInt();
    	int H = sc.nextInt();
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	int r = sc.nextInt();
    	
    	if(0<=y-r&H>=y+r&0<=x-r&w>=x+y){
    		
        System.out.println("Yes");
    	}else{
        	 System.out.println("Yes");
        }
    	
        sc.close();
}
}

