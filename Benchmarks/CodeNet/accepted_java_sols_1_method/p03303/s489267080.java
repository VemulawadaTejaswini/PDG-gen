import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String tex=sc.next();
		int mojisu=tex.length();
		int wake=sc.nextInt();
		String moto="";
		for(int i=0; i<mojisu; i+=wake) {
			moto=moto+tex.charAt(i)+"";
		}
		System.out.println(moto);
	}
}