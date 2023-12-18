import java.util.*;

public class Main{
	  public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();        //nターン
		    int t1 = 0; //太郎の点数
		    int t2 = 0; //花子の点数

		    for(int i = 0;i < n;i++){
		    	String a =sc.next(); //太郎が出したカード
		    	String b =sc.next(); //花子が出したカード		    	
		    	
//		    	System.out.println(a.compareTo(b));
		    	if(a.compareTo(b) > 0){
		    		t1 += 3;
		    	}else if(a.compareTo(b) < 0){
		    		t2 += 3;
		    	}else if(a.compareTo(b) == 0){
		    		t1 += 1;
		    	    t2 += 1;
		        }
		    }
		    System.out.println(t1 +" "+ t2);
	}
}

