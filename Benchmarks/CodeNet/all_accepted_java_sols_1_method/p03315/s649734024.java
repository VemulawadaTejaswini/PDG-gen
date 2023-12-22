import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {       
        
        Scanner sr = new Scanner(System.in);
		String s = sr.next().substring(0,4);
		int takashi_eat = 0;
		
		for(int i = 0; i < s.length(); i++){
			if(s.substring(i, i + 1).equals("+")){
				takashi_eat++;
			}else{
				takashi_eat--;
			}
		}
		System.out.println(takashi_eat);
    }
}