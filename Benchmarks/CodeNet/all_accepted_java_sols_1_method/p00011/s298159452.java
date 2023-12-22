import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int w = sc.nextInt();
	int n = sc.nextInt();

	int[][] change = new int[n][2];
	for(int i=0; i<n; i++){
	    String[] s = (sc.next()).split(",");
	    change[i][0] = Integer.parseInt(s[0]);
	    change[i][1] = Integer.parseInt(s[1]);
	}

	int[] num = new int[w+1];
	for(int i=1; i<=w; i++){
	    num[i] = i;
	}

	for(int i=0; i<n; i++){
	    int temp = num[change[i][0]];
	    num[change[i][0]] = num[change[i][1]];
	    num[change[i][1]] = temp;
	}

	for(int i=1; i<=w; i++){
	    System.out.println(num[i]);
	}
    }
}