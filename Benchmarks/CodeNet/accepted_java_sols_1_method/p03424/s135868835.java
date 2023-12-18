import java.util.Scanner;

public class Main{

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		int count=0;
		for(int i=0;i<n;i++){
			if(s[i].equals("P")){
				count++;
				break;
			}
		}
		for(int i=0;i<n;i++){
			if(s[i].equals("W")){
				count++;
				break;
			}
		}
		for(int i=0;i<n;i++){
			if(s[i].equals("G")){
				count++;
				break;
			}
		}
		for(int i=0;i<n;i++){
			if(s[i].equals("Y")){
				count++;
				break;
			}
		}
		if(count==3){
			System.out.println("Three");
		}else if(count==4){
			System.out.println("Four");
		}
	}
}
