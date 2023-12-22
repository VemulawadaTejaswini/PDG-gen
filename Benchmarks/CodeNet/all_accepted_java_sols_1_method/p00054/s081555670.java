import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){

	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int n = sc.nextInt();

	    double fd = (double)a/(double)b;
	    int fi = a/b;

	    String num = Double.toString(fd-fi);
	    int s = 0;
	    for(int i=0; i<n && i<num.length()-2; i++){
		s += Integer.parseInt(num.substring(2+i,3+i));
	    }

	    System.out.println(s);
	}
    }
}