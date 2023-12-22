import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        String s = " ";
        for(int i=b-a+1;i<=b+a-1;i++){s+=String.valueOf(i) + " ";}
		System.out.println(s);
	}
}
