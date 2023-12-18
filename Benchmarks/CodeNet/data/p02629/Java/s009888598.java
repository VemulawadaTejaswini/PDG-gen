import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
	    Scanner sc = new Scanner(System.in);
		long N=sc.nextLong();
		String t="";
		while(N>0){
		    N--;
		    int temp;
		    temp= 'a'+(int) N%26;
		    t += String.valueOf(Character.toChars(temp));
		    N/=26;
		}
		StringBuffer sb = new StringBuffer(t);
		System.out.println(sb.reverse());
	}
}