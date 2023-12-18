import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scaner2=new Scanner(System.in);
		scaner2.nextLine();
		String[] a=scaner2.nextLine().split(" ");
		reversing(a);
	}
	
	static void reversing(String[] array){
		StringBuilder builder=new StringBuilder();
		for(int i=array.length-1;i>=0;i--){
			builder.append(array[i]+" ");
		}
		System.out.println(builder.toString().trim());
	}

}