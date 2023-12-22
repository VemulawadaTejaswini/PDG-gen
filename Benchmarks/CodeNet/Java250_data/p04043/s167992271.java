import java.util.*;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int [] arr = new int [3];
		arr[0] = a ; arr[1]=b;arr[2]=c;
		int c5=0, c7 =0;
		
		for (int i =0;i<arr.length;i++) {
			if(arr[i]== 5) {
				c5++;}
			else if (arr[i] == 7) {
				c7++;}
		}
		
		
		
		if (c5 ==2 && c7==1) {
			System.out.println("YES");}
		else {
			System.out.println("NO");
		}
		
		
		
    }
}
