import java.util.Scanner;
import java.util.ArrayList;
class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<String> S = new ArrayList<String>();

		boolean result;

		for(int i = 0; i < n; i++){
			String str1 = scan.next();
			String str2 = scan.next();

			if(str1.equals("insert")){
				S.add(str2);
			}else{
				result = linearSearch(S, str2);
				if(result){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}
		}
	}

	static boolean linearSearch(ArrayList<String> data, String serch){

		for(int i = 0; i < data.size(); i++){
			if(data.get(i).equals(serch)){
				return true;
			}
		}
		
		return false;
	}
}