import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	int x = stdIn.nextInt();
	int y = stdIn.nextInt();
	int[] a={0,2,0,1,0,1,0,0,1,0,1,0};
	if(a[x-1]==a[y-1]){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}