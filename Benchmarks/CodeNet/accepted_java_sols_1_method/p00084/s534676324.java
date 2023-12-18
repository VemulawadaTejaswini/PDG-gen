import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<String>array = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String[] str = n.split("[,\\s.]");
		for(int i = 0; i < str.length; i++){
			if(2 < str[i].length() && str[i].length() < 7){
				array.add(str[i]);
			}
		}
		for(int i = 0;i < array.size()-1;i++){
			System.out.print(array.get(i)+" ");
		}
		System.out.println(array.get(array.size()-1));
	}
		 
}