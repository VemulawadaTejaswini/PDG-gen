import java.util.Scanner;
class Main{
    public static void main(String[] a){
		Scanner in = new Scanner(System.in);
		int a, b, sum;
		int digit = 1;
		while(in.hasNextInt()){
			a = in.NextInt();
			if(in.hasNextInt()){
				b = in.NextInt();
			}else{
				break;
			}
			sum = a+b;
			while(sum>=10){
				sum /= 10;
				digit++;
			}
			System.out.println(digit);
			digit = 1;
		}
    }
}