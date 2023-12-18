import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int x,y,i,j;
		
		if(x == 0&&y == 0){
		    return;
		}
		else{
		    for(i=0;i<y;i++){
		        for(j=0;j<x;j++){
		            System.out.print('#');
		        }
		        System.out.println();
		    }
		    System.out.println();
		}
		
		sc.close();
	}

}
