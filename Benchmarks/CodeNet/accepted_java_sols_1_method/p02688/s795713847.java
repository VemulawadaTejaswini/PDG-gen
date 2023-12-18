import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int amt = sc.nextInt();
	int kind = sc.nextInt();
	Set<Integer> st = new HashSet<Integer>();
	for(int i=0;i<kind;i++){
	    int num = sc.nextInt();
	    for(int j=0;j<num;j++){
        int tmp = sc.nextInt();
		Integer id = new Integer(tmp);
		st.add(id);
	    }
	}
	System.out.println(amt-st.size());
      }
}