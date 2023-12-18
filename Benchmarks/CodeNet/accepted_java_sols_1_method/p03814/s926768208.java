import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int num1 = 0, num2 = 0;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='A'){
				num1 = i;
				break;
			}
		}
		for(int i=s.length()-1; i>=0; i--){
			if(s.charAt(i)=='Z'){
				num2 = i;
				break; 
			}
		}
		System.out.println(num2-num1+1);
	}
}