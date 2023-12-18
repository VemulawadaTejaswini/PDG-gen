import java.lang.reflect.Array;
import java.util.*;

public class Main {

 public static int Appearance(int noi1, List<String> los1, int noi2, List<String> los2) {
	int count= 0; 
	 for(int i = 0; i < noi2; i++) {
		 for(int j = 0; j < noi1; j++) {
			 if(los2.get(i).equals(los1.get(j))){
				 count++;
				 break;
			 }
		 }
	 }
	 return count;
 }
 public static List<String> Strtolist(String los) {
	 String arr[] = los.split(" ");
		List<String> newarr = new ArrayList<String>();
		newarr = Arrays.asList(arr);
	 return newarr;
 }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int noi1 = 0, noi2 = 0;
		String sos1 = "", sos2 = "";
		while (input.hasNextLine()) {
			noi1 = input.nextInt();
			input.nextLine();
			sos1 = input.nextLine();
			noi2 = input.nextInt();
			input.nextLine();
			sos2 = input.nextLine();
			List<String> los1 = Strtolist(sos1);
			List<String> los2 = Strtolist(sos2);
			System.out.println(Appearance(noi1, los1, noi2, los2 ));
		}
		input.close();
	}
}

