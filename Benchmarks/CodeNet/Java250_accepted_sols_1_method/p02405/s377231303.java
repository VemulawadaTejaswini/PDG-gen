import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Integer> listH = new ArrayList<Integer>();
		List<Integer> listW = new ArrayList<Integer>();
		for(;;){
			int H = scan.nextInt();
			int W = scan.nextInt();
			if(H == 0 && W == 0){
				break;
			}
			listH.add(H);
			listW.add(W);
		}

		for(int i = 0; i < listH.size(); i++){
			for(int j = 0; j < listH.get(i); j++){
				StringBuffer sb = new StringBuffer();
				for(int k = 0; k < listW.get(i); k++){
					if(j % 2 == 0){
						if(k % 2 == 0){
							sb.append("#");
						} else{
							sb.append(".");
						}
					} else{
						if(k % 2 == 0){
							sb.append(".");
						} else{
							sb.append("#");
						}
					}
				}
				sb.append("\n");
				String str = sb.toString();
				System.out.print(str);
			}
			System.out.println("");
		}
	}
}