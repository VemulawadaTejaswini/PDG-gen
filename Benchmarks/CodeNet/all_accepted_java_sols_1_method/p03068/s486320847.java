import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String s = scn.next();
      	int k = scn.nextInt();
      	String[] list = s.split("");
      	String x = list[k-1];
      	for(int i=0; i<s.length(); ++i){
          if(!(list[i].equals(x))){
            list[i] = "*";
          }
          System.out.print(list[i]);
        }
	}
}