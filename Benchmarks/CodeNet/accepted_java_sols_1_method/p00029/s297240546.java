import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int count = 0;
			int cmax = 0;
			String clen = null;
			int stmax = 0;
			String stlen = null;
			String str = sc.nextLine();
			String[] sta = str.split(" ");
			for(int i = 0 ; i < sta.length ; i++){
				if(stmax < sta[i].length()){
					stmax = sta[i].length();
					stlen = sta[i];
				}
			}
			for(int j = 0 ; j < sta.length ; j++){
				count = 0;
				for(int k = 0 ; k < sta.length ; k++){
					if(sta[j].equalsIgnoreCase(sta[k])){
						count++;
						if(cmax < count){
							cmax = count ;
							clen = sta[j];
						}
					}
				}
				
			}
			System.out.println(clen + " " + stlen);
		}
		sc.close();
		
	}

}