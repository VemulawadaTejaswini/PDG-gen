import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		while(true){

			//1??????????????????
			String s = sc.nextLine();

			if(s.equals("0")){
				break;
			}


			char [] cha = s.toCharArray();
			int sum = 0;

			for(int i = 0; i < cha.length; i++){
				//System.out.println(cha[i]);
				sum += Character.getNumericValue(cha[i]);
			}

			System.out.println(sum);
		}
		sc.close();
	}
}