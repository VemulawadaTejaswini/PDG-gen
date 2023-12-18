import java.util.Scanner;

class Main{
    public static void main(String[] a){
    	Scanner sc = new Scanner(System.in);
    	int x , y ;
    	for(;;){
    		x = sc.nextInt();
    		y=sc.nextInt();
    		if(x==0&&y==0)break;
    		else{
    			for(int j=0; j<y;j++){
    				for(int i = 0;i<x;i++){
    					if(j==0||j==y-1){
    					System.out.print("#");
    					} else if(i==0||i==x-1){
    						System.out.print("#");
    					} else System.out.print(".");
    				}
    				System.out.println();
    			}System.out.println();
    		}

    	}
    }
}