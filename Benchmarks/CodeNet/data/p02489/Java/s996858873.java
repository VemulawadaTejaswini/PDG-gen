import java.util.*;
class Main{
    public static void main(String args[]){
	int i=0;
	Scanner cin = new Scanner(System.in);
	while(true){
	    int x = cin.nextInt();
	    if(x == 0)break;
	    i++;
	    System.out.println("Case "+i+": "+x);
	}
    }
}