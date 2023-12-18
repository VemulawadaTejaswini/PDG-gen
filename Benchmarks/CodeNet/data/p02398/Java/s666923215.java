public class Main {	
	public static void main(String[]args){
		Scanner scan =new Scanner(System.in);
		while(true){
			int a =scan.nextInt();
			int b =scan.nextInt();
			int c =scan.nextInt();
			int i=0; 
			
			while(a>=c){
				if(c%a==0){
					i++;
				}else{
					a++;
				}
			}
			System.out.println(i);				
			}
	}
}