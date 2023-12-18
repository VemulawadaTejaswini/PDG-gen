import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	boolean ans = false;
        int x,y;
	x = sc.nextInt();
	y = sc.nextInt();
	for(int i=0;i<=x;i++){
	    if((2*i+4*(x-i))==y) ans = true;
	}
	if(ans){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
