import java.util.Scanner;


public class Main {
	
	private static boolean chech(char[] input, int start, int last){
		for(int i = start; i <= last; i++){
			if(input[i] == '(' || input[i] == '['){
				char cntup = input[i];
				char cntdown = input[i] == '(' ? ')' : ']';
				
				boolean flag = false;
				int count = 1;
				for(int j = i+1; j <= last; j++){
					if(input[j] == cntup){
						count++;
					}else if(input[j] == cntdown){
						if(count == 1){
							flag = true;
							if(!chech(input, i+1, j-1)){
								return false;
							}
						
							i = j;
						}else{
							count--;
						}
					}
				}
				
				if(!flag){
					return false;
				}
				
			}else if(input[i] == ')' || input[i] == ']'){
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String str = sc.nextLine();
			if (str.equals(".")) {
				break;
			}
			
			while(true){
				if(str.toCharArray()[str.length()-1] == '.'){
					break;
				}
				str = str.concat(sc.nextLine());
			}
			
			
			System.out
					.println(chech(str.toCharArray(), 0, str.length() - 1) ? "yes"
							: "no");
		}
	}
}	