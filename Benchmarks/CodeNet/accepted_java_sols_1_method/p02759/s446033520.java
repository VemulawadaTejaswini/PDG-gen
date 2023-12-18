import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if(n%2==0){
			System.out.println(n/2);
		}else{
			System.out.println(n/2+1);
		}
	}
}