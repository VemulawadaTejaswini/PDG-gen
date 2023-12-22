import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
      	String[] list = s.split("");
      	int count0 = 0;
      	int count1 = 0;
      	for(int i=0; i<s.length(); i++){
          if(list[i].equals("0")) count0++;
          if(list[i].equals("1")) count1++;
        }
      	if(count0>=count1) System.out.println(count1*2);
      	if(count0<count1) System.out.println(count0*2);
	}
}
