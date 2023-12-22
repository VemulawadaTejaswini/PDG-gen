import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n=sc.nextInt();
		int ans = 0;
		String s = sc.nextLine();
		List<String> a = Arrays.asList(s.split(""));
		String[] array = a.toArray(new String[a.size()]);
		String hikaku = "R";
		
		for(int i=0;i<3;i++) {
			if(array[i].equals("R")){
				ans++;
			}
			else if(i==1 && ans==1){
				break;
			}
		}
		
		System.out.println(ans);
	}
}
