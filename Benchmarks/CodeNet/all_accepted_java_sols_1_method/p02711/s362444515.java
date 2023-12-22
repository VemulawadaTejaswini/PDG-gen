import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String[] list = s.split("");
      	int check = 0;
      	for(int i=0; i<s.length(); i++){
          if(list[i].equals("7")) check=1;
        }
      	if(check==0) System.out.println("No");
      	else System.out.println("Yes");
	}
}
