import java.util.Scanner;

public class Main {
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String output;
		if(a<b){
			if(b<c){
				output = makeOutputString(a,b,c);
			} else {
				if(a<c){
					output = makeOutputString(a,c,b);
				} else{
					output = makeOutputString(c,a,b);
				}
			}
		}else{
			if(a<c){
				output = makeOutputString(b,a,c);
			}else{
				if(b<c){
					output = makeOutputString(b,c,a);
				}else{
					output = makeOutputString(c,b,a);
				}
			}
		}
		System.out.println(output);
		sc.close();
	}
	private String makeOutputString(int min1, int min2, int min3) {
		return new StringBuilder().append(min1).append(" ").append(min2).append(" ").append(min3).toString();
	}

	public static void main(String[] args)  {
		new Main().exec();
	}
}