import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] array = line.split("");

        int ans = 0;

        for(int i = 0; i < 4; i++){
        	if(array[i].equals("+")){
        		ans++;
        	}else if(array[i].equals("-")){
        		ans--;
        	}
        }
        System.out.println(ans);
	}

}
