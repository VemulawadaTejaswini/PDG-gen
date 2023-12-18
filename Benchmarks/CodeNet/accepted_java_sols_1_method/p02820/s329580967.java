import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    final int R = sc.nextInt();
    final int S = sc.nextInt();
    final int P = sc.nextInt();
    final String T = sc.next();
    sc.close();
    StringBuilder byK = new StringBuilder();
    int point = 0;
    for(int i=0;i<K;i++) {
    	switch(T.charAt(i)) {
		case 'r' :
			point += P;
			byK.append("r");
			break;
		case 's' :
			point += R;
			byK.append("s");
			break;
		case 'p' :
			point += S;
			byK.append("p");
			break;
		}
    }
    for(int i=K;i<N;i++) {
    	if(byK.charAt(i-K) == T.charAt(i)) {
    		point += 0;
    		if(byK.length()<i+1) {
    			byK.append("c");
    		}
    		byK.setCharAt(i-K, 'c');

    	}else {
    		switch(T.charAt(i)) {
    		case 'r' :
    			point += P;
    			byK.append("r");
    			break;
    		case 's' :
    			point += R;
    			byK.append("s");
    			break;
    		case 'p' :
    			point += S;
    			byK.append("p");
    			break;
    		}
    	}
    }
    System.out.println(point);
  }
}