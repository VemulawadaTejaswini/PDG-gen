import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int[]c = new int[N];
    int[]t = new int[N];
    ArrayList<Integer> A =  new ArrayList<>();

    for(int i=0; i<N; i++) {
    	c[i] = sc.nextInt();
    	t[i] = sc.nextInt();
    if(t[i]<=T) {
    	A.add(c[i]);
    }
}
    Collections.sort(A);
    if(A.size() == 0) {
    	System.out.println("TLE");
    }else {
    System.out.println(A.get(0));
    }
}
}