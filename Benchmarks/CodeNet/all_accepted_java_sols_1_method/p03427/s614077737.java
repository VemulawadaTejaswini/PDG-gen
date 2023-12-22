import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();

		int origin=0;
		for(int n=0;n<st.length();n++){
			origin += Character.getNumericValue(st.charAt(n));
		} 
		int res=0;
		res += 9*(st.length()-1);
		res += Character.getNumericValue(st.charAt(0)-1);

		if(origin > res) System.out.println(origin);
		else System.out.println(res);

	}
}