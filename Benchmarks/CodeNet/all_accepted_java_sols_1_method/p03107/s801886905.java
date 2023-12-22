import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] inputs = line.toCharArray();
        
        int red = 0, yellow = 0;
        for(char c : inputs) {
            if(c == '0') red++;
            else yellow++;
        }
        int ans = Math.min(red, yellow)*2;

		System.out.println(ans);
	}
}
