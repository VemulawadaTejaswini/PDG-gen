import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			int n = scanner.nextInt();
			int x = scanner.nextInt();    
			
			if((n==0)&&(x==0)){
				break;
				}
			int y =0;
			int anther=0;

			for(int a=1;a<n+1;a++){	
				for(int b=2;b<n+1;b++){
					for(int c=3;c<n+1;c++){
						y =a+b+c;
						if(((((a<b) && (b<c)) && (a<c))&&(y==x))) {
							anther++;
						}
					}
				}


			}
			System.out.println(anther);
		}
			scanner.close();
		
	}
}
