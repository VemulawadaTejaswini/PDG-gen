import java.util.Scanner;
 
public class Main{
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int i;
	
    while(true){
        int x = sc.nextInt();
        int y = sc.nextInt();
	i = 1;
        if(x==0 && y==0) break;
	while(true){
	    if(i==1){
		for(int j=1; j<=y; j++){
		    System.out.printf("#");
		}
	    }else if(i==y){
		for(int j=1; j<=y; j++){
		    System.out.printf("#");
		}
		break;
	    }else{
		System.out.printf("#");
		for(int j=1; j<=y-2; j++){
		    System.out.printf(".");
		}
		System.out.printf("#");
	    }
	    System.out.println();
		i++;
	}
	
	System.out.printf("\n");
    }
    }
}

 
	