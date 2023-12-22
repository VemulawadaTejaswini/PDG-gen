import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine()+'Z';
		int sum = 0;
		for(int i=0;i<n;i++){
			if(s.charAt(i)!=s.charAt(i+1))
				sum++;
		}
		System.out.println(sum);
	}
}