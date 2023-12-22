import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int x = 0, max=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == 'I'){
		   		x += 1;
				//System.out.println("added");
		   }else{
	   			x -= 1;
				//System.out.println("sub");
		   }
			if(max < x){
		 		max = x;
			}	
		}
		System.out.println(max);

	}
}	
