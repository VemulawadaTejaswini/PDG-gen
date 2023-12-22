import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        
        String seikai = null;
        String hare = "Sunny";
        String kumori = "Cloudy";
        String Ame = "Rainy";
        
        if(S.equals(hare)) {
        	seikai = "Cloudy";
        }
        if(S.equals(kumori)) {
        	seikai = "Rainy";
        }
        if(S.equals(Ame)) {
        	seikai = "Sunny";
        }

        System.out.println(seikai);

	}

}
