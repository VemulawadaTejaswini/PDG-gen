import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		Boolean flag = true;
		for(int i=0;i<S.length();i++){
			if(S.charAt(i)=='U'||S.charAt(i)=='D'){
				continue;
			}
			if(i%2==0){
				if(S.charAt(i)=='R'){
					continue;
				}else{
					flag = false;
					// System.out.println(S.charAt(i)+"\t"+i);
					break;
				}
			}else{
				if(S.charAt(i)=='L'){
					continue;
				}else{
					flag = false;
					// System.out.println(S.charAt(i)+"\t"+i);
					break;
				}
			}
		}
		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}