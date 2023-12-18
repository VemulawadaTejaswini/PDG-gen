import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String[] st = new String[3];
			for(int i = 0; i < 3; i++){
				st[i] = "";
			}
			String str = sc.next();
			char ch[] = str.toCharArray();
			int p = 0;
			for(int i = 0; i < str.length(); i++){
				if(ch[i] == '+' || ch[i] == '='){
					p++;
					continue;
				}
				st[p] += String.valueOf(ch[i]);
			}
			int s = 0;
			for(int i = 0; i < 3; i++){
				if(st[i].charAt(0) == 'X'){
					s = 1;
					break;
				}
			}
			int t = -1;
			for(int i = s; i <= 9; i++){
				BigDecimal bd1 = new BigDecimal(st[0].replaceAll("X", Integer.toString(i)));
				BigDecimal bd2 = new BigDecimal(st[1].replaceAll("X", Integer.toString(i)));
				BigDecimal bd3 = new BigDecimal(st[2].replaceAll("X", Integer.toString(i)));
				
				bd1 = bd1.add(bd2);
				if(bd1.compareTo(bd3) == 0){
					t = i;
					break;
				}
			}
			
			if(t == -1){
				System.out.println("NA");
			} else {
				System.out.println(Integer.toString(t));
			}
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}