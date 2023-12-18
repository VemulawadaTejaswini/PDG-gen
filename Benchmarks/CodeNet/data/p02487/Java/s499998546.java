import java.util.*;

class Main{
    public static void main(String args[]){
	int h=1,w=1;
	Scanner cin = new Scanner(System.in);
	while(h!=0 && w!=0){
	    h = cin.nextInt();
	    w = cin.nextInt();
	    for(int i=0;i<h;i++){
		for(int j=0;j<w;j++){
		    if(i==0||i==h-1||j==0||j==w-1){
			System.out.print("#");
		    }
		    else{
			System.out.print(".");
		    }
		}
		System.out.print("\n");
	    }
	}
    }
}