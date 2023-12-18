import java.util.Scanner;

public class Main {
	
	public static char[][] code = 
		{
			{'a' , 'f' , 'k' , 'p' , 'u' , 'z'},
			{'b' , 'g' , 'l' , 'q' , 'v' , '.'},
			{'c' , 'h' , 'm' , 'r' , 'w' , '?'},
			{'d' , 'i' , 'n' , 's' , 'x' , '!'},
			{'e' , 'j' , 'o' , 't' , 'y' , ' '}
		};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			
			String  str = sc.nextLine();
			
			if(str.length() % 2 == 1){
				System.out.println("NA");
				continue;
			}
			
			char[] array = new char[str.length()/2];
			
			try{
				boolean ok = true;
				
				for (int i = 0; i < str.length() / 2; i++) {
					int first = Integer.parseInt(str.charAt(2*i) + "");
					int second = Integer.parseInt(str.charAt(2*i + 1) + "");
					
					if(0 < first && first < 7 && 0 < second && second < 6){
						array[i] = code[second-1][first-1];
					}else{
						System.out.println("NA");
						ok = false;
						break;
					}
				}
				
				if(ok){
					System.out.println(String.valueOf(array));
				}
			}catch(NumberFormatException e){
				System.out.println("NA");
			}
			
		}
		
	}
	
}