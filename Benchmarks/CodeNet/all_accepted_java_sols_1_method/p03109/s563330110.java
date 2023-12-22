import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] inputs = line.split("/");

		String ans;
		if(Integer.parseInt(inputs[1]) > 4){
			ans = "TBD";
		}else{
			ans = "Heisei";
		}

		System.out.println(ans);
	}
}
