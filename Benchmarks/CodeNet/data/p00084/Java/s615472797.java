import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String text = sc.nextLine();
			String[] word = text.split(" ");
			int count=0;
			
			for(int i=0; i<word.length; i++){		
				int n = word[i].length();
						
				if(word[i].charAt(n-1) == ',' || word[i].charAt(n-1) == '.') {
					n--;
				}
		
				if(n>=3 && n<=6) {
					if(count>0) System.out.print(" ");
					System.out.print(word[i].substring(0,n));
					count++;
				}
				
			}
			
			if(count>0) System.out.println();
		}
	
	}
}