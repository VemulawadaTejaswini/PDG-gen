import java.util.*;
import java.io.*;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner br = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String turn = br.next();
		Integer tarou = 0;
		Integer hanako = 0;
		for(int i = 0; i < Integer.parseInt(turn); i++){
			String[] battle = {br.next(), br.next()};
			String[] battle_bkp = battle.clone();
			Arrays.sort(battle);
			if(battle[0].equals(battle[1])){
				tarou += 1;
				hanako += 1;
			}
			else if(battle[0].equals(battle_bkp[0]) && battle[1].equals(battle_bkp[1])){
				hanako += 3;
			}
			else{
				tarou += 3;
			}
		}
		System.out.println(tarou + " " + hanako);
	}
}