import java.util.*;
class Main{
    public static void main(String args[]){
	Scanner cin = new Scanner(System.in);
	int a = cin.nextInt();
	int b = cin.nextInt();
	judge(a,b);
    }

    
    public static void judge(int a,int b){
	if(a < b){
	    System.out.println("a < b");
	}
	else if(a > b){
	    System.out.println("a > b");
	}
	else{
	    System.out.println("a == b");
	}
    }
}