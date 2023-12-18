import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		//System.out.print(" ");
		Scanner scan = new Scanner(System.in);
		ArrayList<String> moji = new ArrayList<String>();
		String mm = "10";
		while(!mm.equals("0")){
			mm = scan.nextLine();
//			String mmToSt = String.valueOf(mm);
			moji.add(mm);
//			System.out.println("scannning");
		}
//		System.out.println("finir");
		for(int i=0; i<moji.size()-1; i++){
			String henkan = moji.get(i);
			char[] ichimoji = henkan.toCharArray();
			long nagasa = henkan.length();
			long sum = 0;
			for(int ii=0; ii<nagasa; ii++){
					sum += Character.getNumericValue(ichimoji[ii]);
			}
			System.out.println(sum);
		}
	}
}