import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	int z = sc.nextInt();
    	int j=0;
    	while(x<=y){
    		if(z%x==0){
    						j++;
    					}
    					x++;
    				

    		}
    		 System.out.println(j);
        sc.close();
}
}

