import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = s+s;
		char []s1str = s1.toCharArray();
		
		String p = sc.nextLine();
		char []pstr = p.toCharArray();
		boolean flag = false;
		
		String msg = "No";
		
		for (int i = 0; i < s.length(); i++){
		    for(int l = 0; l < p.length(); l++){
		        if (s1str[i+l] != pstr[l]){
		            flag = false;
		            break;
		        }
		        flag = true;
		    }
		    
		    if (flag == true){
		        msg = "Yes";
		        break;
		    } 
		} 
		
		System.out.println(msg);
	}
}
