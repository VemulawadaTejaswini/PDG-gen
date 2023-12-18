import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int x,y,i=0,j=0;
		
		while(true){
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0){
				sc.close();
				return;
			}
			else{
				for(i=0;i<x;i++){
				    if(i==0 || i==(x-1)){
				    	for(j=0;j<y;j++){
				    		System.out.print('#');
				    	}
				    }
				    else{
				        if(j==0 || j==(y-1)){
				            System.out.print('#');
				        }
				        else{
				            System.out.print('.');
				        }
				    }
				    System.out.println();
				}
				System.out.println();
			}
		}
	}

}
