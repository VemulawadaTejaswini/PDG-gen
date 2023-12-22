import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first=0,second=0,third=0;
		int set;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++){
			
			set = sc.nextInt();
			
			if(first<set){
				third = second;
				second = first;
				first = set;
			}else if(second<set){
				third = second;
				second = set;
			}else if(third<set){
				third = set;
			}
			
		}
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}

}