import java.util.Scanner;

class Small_Large_or_Equal {

    int a,b;
	
	public void suzuki(){
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a < b){
			System.out.println("a < b");
		}else if(a > b){
			System.out.println("a > b");
		}else{
			System.out.println("a == b");
		}
	}
	public static void main(String[] args){
		
		new Small_Large_or_Equal().suzuki();
	}
}