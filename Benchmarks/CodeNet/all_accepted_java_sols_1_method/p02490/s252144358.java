import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> result = new ArrayList<String>();

		while(sc.hasNextLine()){
			//ÇÝñ¾s©çQÂ®ðÇÝæé
			int a = sc.nextInt();
			int b = sc.nextInt();

			//üÍª"0 0"ÌÆ«üÍÇÝÝÌI¹
			if(a == 0 && b == 0){
				break;
			}
			//¬³¢ÉÀÑÖ¦é
			if(a > b){
				int tmp = a;
				a = b;
				b = tmp;
			}	

			//ÀÑÖ¦½ðtH[}bgÉ]ÁÄ\[gÊXgÉÇÁ·é
			result.add(a + " " + b);
		}

		//\[gÊXgðoÍ·é
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
}