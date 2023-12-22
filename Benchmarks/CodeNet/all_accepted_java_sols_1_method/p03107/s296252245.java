import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[]c=scan.next().toCharArray();
		int num0=0;
		int  num1=0;
		for(int i=0;i<c.length;i++){
			if(Character.getNumericValue(c[i])==0){
				num0++;
			}else{
				num1++;
			}
		}
		if(num0<num1){
			System.out.println(2*num0);
		}else{
			System.out.println(2*num1);
		}
	}
}