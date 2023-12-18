import java.util.*;

public class Main {
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int n = sc.nextInt();

	int[] h = new int[n];
	for(int i = 0; i < n; i++){
	    h[i] = sc.nextInt();
	}

	int ans = 0;
	boolean lastWatered;
	for(int level = 100; level > 0; level--){
	    lastWatered = false;
	    for(int i = 0; i < n; i++){
		if(h[i] == level){
		    h[i]--;
		    if(lastWatered){
			// do nothing
		    }else{
			ans++;
			lastWatered = true;
		    }
		}else{
		    lastWatered = false;
		}
	    }
	}

	System.out.println(ans);
    }

}


