import java.util.Scanner;
class Main{
    public static void main(String[] a){
		Scanner in = new Scanner(System.in);
		int top, second, third, input;
		top = -1;
		second = -2;
		third = -3;
		for(int i=0; i<10; i++){
			input = in.nextInt();
			if(input>top){
				third = second;
				second = top;
				top = input;
			}else if(input>second){
				third = second;
				second = input;
			}else if(input>third){
				third = input;
			}
		}
		System.out.println(top);
		System.out.println(second);
		System.out.println(third);
    }
}