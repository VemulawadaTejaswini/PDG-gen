import java.util.Scanner;
class Main{
    public static void main(String[] args){
	int x,y,temp;
	
	Scanner scan = new Scanner(System.in);
	x = scan.nextInt();
	y = scan.nextInt();
	
      	if(1>x || x>1000000000){System.exit(0);}
	if(1>y || y>1000000000){System.exit(0);}
	
	if(x>=y){
	    while((temp = x%y) != 0){
		x = y;
		y = temp;
	    }
	    System.out.println(y);
	}
	else {
	    while((temp = y%x)!=0){
		y = x;
		x = temp;
	    }
	    System.out.println(x);
	}
    }
}

