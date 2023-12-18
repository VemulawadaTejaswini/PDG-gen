import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int input = sc.nextInt();
			
			if(input == 0){
				break;
			}
			
			int limit = (int)Math.sqrt(input);
			
			int count = 0;
			
			for(int i = 1; i <= limit; i++){
				if(i*i == input){
					count++;
					break;
				}
				
				for(int j = i; j <= limit; j++){
					if(i*i + j*j == input){
						count++;
						break;
					}
					
					for(int k = j; k <= limit; k++){
						if(i*i + j*j + k*k == input){
							count++;
							break;
						}
						
						for(int l = k; l <= limit; l++){
							if(i*i + j*j + k*k + l*l == input){
								count++;
								break;
							}
						}
							
					}
				}
			}
			
			System.out.println(count);
		}
	}

}

