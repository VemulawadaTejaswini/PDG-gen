import java.util.*;

class Main{
    public static void main(String args[]){
	int h=1,w=1;
	Scanner cin = new Scanner(System.in);
	while(h!=0&&w!=0){
	    h = cin.nextInt();
	    w = cin.nextInt();
	    for(int i=0;i<h;i++){
		for(int j=0;j<w;j++){
		    if(j%2==0&&i%2==0){
			System.out.print("#");
		    }
		    if(j%2==0&&i%2!=0){
			System.out.print(".");
		    }
		    if(j%2!=0&&i%2==0){
			System.out.print(".");
		    }
		    if(j%2!=0&&i%2!=0){
			System.out.print("#");
		    }
		}
		System.out.print("\n");
	    }
	    if(h!=0&&w!=0){
		System.out.print("\n");
	    }
	}
    }
}