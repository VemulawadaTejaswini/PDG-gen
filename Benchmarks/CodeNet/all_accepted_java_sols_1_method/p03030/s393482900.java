import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s=new String[n];
		
		for(int i = 0;i<n;i++){
	        String ss = sc.next();
	        int num = sc.nextInt();
	        int num2 = i+1;
	        //S[i]が同じ文字列だった場合、昇順ソート後の値でnumを比較するため
	        s[i] = ss + " " + 1/(double)num + " " + num2;
	    }
		
		Arrays.sort(s);
		 
	    for(String j:s){
	        System.out.println(j.split(" ")[2]);
	    }
		
		sc.close();
	}
}
