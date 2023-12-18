import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, k;
    int[] blood;
    boolean ans;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    k = sc.nextInt();
	    if(n==0 && k==0) break;
	    blood = new int[k];
	    ans = true;

	    for(int i=0; i<k; i++)
		blood[i] = sc.nextInt();
	    
	    for(int i=0; i<n; i++)
		for(int j=0; j<k; j++){
		    blood[j] -= sc.nextInt();
		    if(blood[j]<0) ans = false;
		}

	    System.out.println(ans ? "Yes" : "No");
	}
    }
}