import java.util.*;
class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		b = a / 3600;
    	int h = a % 3600 / 60;	
		int t = a % 60;  
		System.out.println(b + ":" + h + ":" + t);
	}
}

