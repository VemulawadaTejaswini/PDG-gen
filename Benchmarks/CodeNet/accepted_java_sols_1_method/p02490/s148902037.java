import java.util.*;
class Main{
    public static void main(String args[]){
	int i=0;
	Scanner cin = new Scanner(System.in);
	while(true){
	    int x = cin.nextInt();
	    int y = cin.nextInt();
	    int tmp;
	    if(x==0 && y==0)break;
	    else if(x>y){
		tmp=x;
		x=y;
		y=tmp;
	    }
	    System.out.println(x+" "+y);
	}
    }
}