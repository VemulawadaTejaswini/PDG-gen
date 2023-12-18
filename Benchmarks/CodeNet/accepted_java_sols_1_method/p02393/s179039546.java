import java.util.Scanner;
import java.util.Arrays;

class Main{
	
	public static void main(String[] args){

		int s[]=new int[3];
		int i,j;
		j = 0;
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<s.length;i++){
		s[i]= sc.nextInt();
		}
		
		Arrays.sort(s);
		
		System.out.println(s[0] + " " + s[1] + " " + s[2]);
		
		
	}

}