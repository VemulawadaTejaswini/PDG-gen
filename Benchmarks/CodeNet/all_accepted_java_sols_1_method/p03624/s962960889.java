import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = "abcdefghijklmnopqrxtuvwxyz";
		String[] param = b.split("");
		for(int i = 0; i < param.length;i++){
			if(a.contains(param[i]) == true){
			
			}else if(a.contains(param[i]) == false){
				System.out.println(param[i]);
				return;
			}
		}
		System.out.println("None");

	}
}