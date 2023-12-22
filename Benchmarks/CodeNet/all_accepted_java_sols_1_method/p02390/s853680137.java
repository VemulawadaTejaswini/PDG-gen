import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
	System.out.println(s/3600 + ":" + s%3600/60 + ":" + s%3600%60);
	}
}