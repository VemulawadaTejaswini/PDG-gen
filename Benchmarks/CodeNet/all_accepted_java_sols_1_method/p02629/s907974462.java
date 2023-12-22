import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
	    Scanner sc = new Scanner(System.in);
		long N=sc.nextLong();
		sc.close();
		String t="";
		while(N>0){
		    N--;
		    t+=(char)('a'+N%26);
		    N/=26;
		}
		for(int i=t.length()-1;i>=0;i--) {
			System.out.print(t.charAt(i));
		}
	}
}
