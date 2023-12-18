import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		label:for(;;){
			String s = cin.nextLine();
			if(s.equals("."))break;
			int[] s1=new int[101];
			int[] s2=new int[101];
			int idx1=1;int idx2=1;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='['){
					idx1++;
				}
				if(s.charAt(i)==']'){
					idx1--;
				}
				if(s.charAt(i)=='('){
					idx2++;
				}
				if(s.charAt(i)==')'){
					idx2--;
				}
				if(idx1==0||idx2==0){
					System.out.println("no");
					continue label;
				}
			}
			if(idx1==1&&idx2==1){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}

	}

}