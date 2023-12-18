import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		String str =sc.next();
		String aaa="";
		String bbb="";
		if(str.length()%2==0&&str.length()==N) {
			for(int i=0;i<(N/2);i++){
			aaa = aaa+str.charAt(i);
			bbb = bbb+str.charAt(i+(N/2));
			}
			if(aaa.equals(bbb)) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		}
		else {
			System.out.print("No");
		}
		sc.close();
		}
	}