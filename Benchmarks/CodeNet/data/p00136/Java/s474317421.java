import java.util.*;
class Main{
	static Scanner sc = new Scanner(System.in);
	static int student_number;
	static double height;
	static int one, two, three, four, five, six;
	static int[] array;
	
	public static void main(String[] args){
		read();
		slove();
		
	}
	static boolean read(){
		
		student_number = sc.nextInt();
		for(int i = 0; i < student_number; i++){
			height = sc.nextDouble();
			if(height < 165.0){
				one++;
			}else if(height >= 165.0 && height < 170.0){
				two++;
			}else if(height >= 170.0 && height < 175.0){
				three++;
			}else if(height >= 175.0 && height < 180.0){
				four++;
			}else if(height >= 180.0 && height < 185.0){
				five++;
			}else{
				six++;
			}
		}
		
		return true;
	}
	static void slove(){
		array = new int[7];
		array[1] = one;
		array[2] = two;
		array[3] = three;
		array[4] = four;
		array[5] = five;
		array[6] = six;
		
		for(int i = 1; i <= 6; i++){
			System.out.print(i+":");
			for(int j = 1; j <= array[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}