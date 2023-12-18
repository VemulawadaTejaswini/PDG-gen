import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);



    		while(true){
    	    	int a = sc.nextInt();
    	    	int b = sc.nextInt();
    		if(a==0 && b==0){
    			break;
    		}else{
    			for(int x=1;x<=a;x++){
    		for(int y=1;y<=b;y++){
    		if(x==1){
    		System.out.print("#");
    		}else if(x==a){
    		System.out.print("#");
    		}else if(y==1 || y==b){
    		System.out.print("#");
    		}else if(y<b){
    		System.out.print(".");
    		}
    		}
    		System.out.println("");
    		}
    		}
    }
}
}

