
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StringWriter result = new StringWriter();
		PrintWriter out = new PrintWriter(result);

		while(true){
			int members = sc.nextInt();
			int kinds = sc.nextInt();
			if(members == 0 && kinds == 0){
				break;
			}
			int[] keeps = new int[kinds];
			boolean flag = true;

			for(int i = 0;i < kinds;i++){
				keeps[i] = sc.nextInt();
			}

			for(int i = members;i > 0;i--){
				for(int j = 0;j < kinds;j++){
					keeps[j]-=sc.nextInt();
				}
			}

			for(int i : keeps){
				if(i < 0){
					flag = false;
				}
			}

			out.println(flag?"Yes":"No");
		}

		System.out.print(result.toString());
	}
}