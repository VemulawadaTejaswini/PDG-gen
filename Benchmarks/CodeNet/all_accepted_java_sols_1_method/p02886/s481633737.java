import java.util.ArrayList;
import java.util.Scanner;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //int[] d = new int[n];
    ArrayList<Integer> di = new ArrayList<>();

    for(int i = 0; i< n; i++){
    	int a = sc.nextInt();
    	if(a > 0) {
    		di.add(a);
    	}
    }
    //ArrayList<Integer> sa = new ArrayList<>();
    ArrayList<Integer> ka = new ArrayList<>();
    ka = (ArrayList<Integer>) di.clone();

    int ans = 0;
    for(int i = 0; i < di.size();i++){
    	ka.remove(0);
    	for(int j =0; j  < ka.size(); j++) {
    		ans += di.get(i) * ka.get(j);
        	}
    	}
	System.out.println(ans);
  }
}