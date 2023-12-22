import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st = new Scanner(System.in);
		String s = st.nextLine();
		String a = "CODEFESTIVAL2016" ;
		char[] sAr = s.toCharArray();
		char[] aAr = a.toCharArray();
		int count = 0;
		for (int i=0;i<s.length();i++){
			if((sAr[i]^aAr[i])!=0){
				count++;
			}
		}
		System.out.println(count);
	}

}