import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		while(true){
			String str=sc.nextLine();
			if(str.equals("0")) break;
			int[] ch=new int[str.length()];
			int sum=0;
			for(int i=0;i<str.length();i++){
				ch[i]=Character.getNumericValue(str.charAt(i));
				sum=sum+ch[i];
			}
			System.out.println(sum);
		}
	}
}