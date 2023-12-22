import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
		int c = Math.max(a,b);
        int d = 0;
        for(int i=0;i<c;i++){d+=Math.min(a,b)*Math.pow(10,i);}
          System.out.println(d);                                
    }
}
