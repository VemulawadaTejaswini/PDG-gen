import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		while(true){
			String line=sc.nextLine();
			
			if(line.equals("0")){
				break;
			}
			
			int n=Integer.parseInt(line);
			int counter=0;//?????°
			
			if(n==1){
				System.out.println(1);
			}else{
				
				for(int i=n+1; i<=2*n; i++){
					
					for(int h=2; h<=Math.sqrt(i); h++){
						
						if(i%h==0){
							counter++;
							break;
						}
						
					}
					
				}
				
				System.out.println(n-counter);
			}
			
			
			
		}
	}
}