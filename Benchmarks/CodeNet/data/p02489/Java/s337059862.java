import java.util.*;
class Main{
    public static void main(String args[]){
	int i=1;
	while(true){
	    Scanner cin = new Scanner(System.in);
	    int x = cin.nextInt();
	    if(x==0)break;
	    System.out.println("Case "+i+": "+x);
	    i++;
	}
    }
}