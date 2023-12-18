import java.util.Scanner;


class Main {

	public static void main(String[] args) {   

		Scanner scanner = new Scanner(System.in);

		int n=scanner.nextInt();
		int scoret=0;
		int scoreh=0;
		
		
		for(int i=0;i<n;i++){
			String taro=scanner.next();
			String hanako=scanner.next();
			
			int num=taro.compareTo(hanako);
			
			if(num<0){
				scoreh=scoreh+3;
			}
			else if(num>0){
				scoret=scoret+3;
			}
			else{
				scoreh=scoreh+1;
				scoret=scoret+1;
			}
			
		}
		
		System.out.println(scoret+" "+scoreh);	
	}
}


