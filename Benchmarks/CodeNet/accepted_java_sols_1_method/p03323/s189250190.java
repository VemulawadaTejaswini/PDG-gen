import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] array = line.split(" ");

		//A B
		int A = Integer.parseInt(array[0]);
        int B = Integer.parseInt(array[1]);

        if(A <= 8 && B <= 8 ){
        	System.out.println("Yay!");
        }else{
        	System.out.println(":(");
        }

	}

}
