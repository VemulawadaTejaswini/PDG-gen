import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int check = 0;
		int a = n/100;
		int b = n-a*100;
		if(a*5>=b){
		    check = 1;
		}
		System.out.println(check);
    }
}