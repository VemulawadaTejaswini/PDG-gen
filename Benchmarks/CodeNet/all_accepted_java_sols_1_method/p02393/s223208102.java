import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);

	int x = stdIn.nextInt();

	int y = stdIn.nextInt();
	
	int z = stdIn.nextInt();
	int temp;

	if(x > y ){
	    temp = x;
	    x = y;
	    y = temp;
	}
        if(x > z ){
	    temp = x;
	    x = z;
	    z = temp;
	}
	if(y > z ){
	    temp = z;
	    z = y;
	    y = temp;
	}
	System.out.printf("%d %d %d\n",x,y,z);
    }
}