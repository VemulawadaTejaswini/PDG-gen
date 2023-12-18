import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner ss = new Scanner(System.in);
		Scanner st = new Scanner(System.in);
		
		String s = ss.nextLine();
		String t = st.nextLine();
		
		int count=0;
		
		char[] sstri= s.toCharArray();
		char[] tstri= t.toCharArray();
		
		for(int i=0;i<=sstri.length;i++){
			if(i==sstri.length){
				System.out.print(count);
			}
			else if(sstri[i] != tstri[i]){
				sstri[i] = tstri[i];
				count++;
			}
		}
	}
}