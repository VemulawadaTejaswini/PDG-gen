import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] array = s.toCharArray();
		
		for(int i=0;i<array.length;i++){
			if(array[2]==array[3]&&array[4]==array[5]){
				System.out.print("Yes");
				break;
			}
			else {
				System.out.print("No");
				break;
			}
		}
	}
}