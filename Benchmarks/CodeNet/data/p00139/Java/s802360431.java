import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++){
			char[] str = sc.nextLine().toCharArray();
			
			boolean is_na = false;
			boolean is_a = false;
			
			if(str[0] == '>'){
				if(str[1] == '\'' ){
					int len = 0;
					int count = 0;
					boolean flag = false;
					
					for(int j = 2; j < str.length; j++){
						if(count == 0 && flag == true){
							len = j;
							break;
						}
						
						if(str[j] == '='){
							count += flag ? -1 : 1;
						}else if(str[j] == '#'){
							flag = true;
						}
					}
					
					if(len == str.length-1 && str[len] == '~'){
						is_a = true;
					}else{
						is_na = true;
					}
					
					
				}else if(str[1] == '^'){
					
					for(int j = 0; j < (str.length - 4)/2; j++){
						if(str[j*2 + 2] != 'Q' || str[j*2 + 2 + 1] != '='){
							is_na = true;
						}
					}
					
					if(str[str.length -2] == '~' && str[str.length -1] == '~'){
						is_a = false;
					}
					
				}else{
					is_na = true;
				}
			}else{
				is_na = true;
			}
			
			System.out.println(is_na ? "NA" : is_a ? "A" : "B");
			
		}
		
	}
	
}