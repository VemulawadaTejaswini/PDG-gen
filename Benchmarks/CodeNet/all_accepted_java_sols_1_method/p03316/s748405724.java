import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        int N = Integer.parseInt(line);
        String[] array = line.split("");

        int Snum = 0;
        int arrayLength = array.length;

        for(int i = 0; i < arrayLength; i++){
        	Snum += Integer.parseInt(array[i]);
        }

        if(N % Snum == 0){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}

}
