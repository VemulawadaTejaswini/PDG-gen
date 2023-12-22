import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
      	int a = 0;
      	int z = s.length()-1;
      	while (a<z){
            if(s.charAt(a)=='A' && s.charAt(z)=='Z'){
                break;
            }
            if(s.charAt(a) != 'A') a++;
            if(s.charAt(z) != 'Z') z--;
        }
        System.out.println(z - a + 1);
	}
}