import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String s = scan.next();
	    scan.close();

	    int arr[]=new int[s.length()];
	    for(int i=0;i<s.length();i++) {
	    	arr[i]=Character.getNumericValue(s.charAt(i));
	    }
	    int cnt=0;
	    for(int i=1;i<s.length();i++) {
	    	if(arr[i-1]==arr[i]) {
	    		arr[i] = (arr[i]+1)%2;
	    		cnt++;
	    	}
	    }

	    System.out.println(cnt);

	}

}