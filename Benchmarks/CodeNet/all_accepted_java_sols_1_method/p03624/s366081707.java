import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		int arr[]=new int[26];

		for(int i=0;i<arr.length;i++) {
			arr[i]=0;
		}

		int a='a';
		for(int i=0;i<s.length();i++) {
			int num = s.charAt(i)-a;
			arr[num]=1;
		}
		for(int i=0;i<26;i++) {
			if(arr[i]==0) {
				char ans=(char)(a+i);
				System.out.println(ans);
				break;
			}
			else if(i==25)System.out.println("None");
		}

	}

}
