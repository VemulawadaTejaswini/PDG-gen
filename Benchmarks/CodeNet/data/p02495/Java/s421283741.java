import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	while(true){
	    int a = in.nextInt();
	    int b = in.nextInt();

	    if(a == 0 && b == 0) break;	 
   
	    for(int i = 0 ; i < a ; i++){
		for(int j = 0 ; j < b ; j++){
		    if((i+j) % 2 == 0){
			System.out.print("#");
		    }else{
			System.out.print(".");
		    }
		}
		System.out.println("");
	    }
	    System.out.println("");
	}
    }
}