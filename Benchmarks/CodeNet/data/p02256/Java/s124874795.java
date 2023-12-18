import java.util.Scanner;
class Main{
    public static void main(String[] args){
	int x,y,temp=0,max=0;
	
	Scanner scan = new Scanner(System.in);
	x = scan.nextInt();
	y = scan.nextInt();

	if(1>=x || x>=1000000000){
	    if(1>=y || y>=1000000000){
		System.exit(0);
	    }
	}
	
	if(x>=y){
	    temp = x % y;
	    while(temp!=0){
		x = y;
		y = temp;
		temp = x % y;
		max = y;
	    }
	}
	else {
	    temp = x % y;
	    while(temp!=0){
		y = x;
		x = temp;
		temp = y % x;
		max=x;
	    }
	}
	System.out.println(max);
    }
}

