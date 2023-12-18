import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }

    Scanner kbd = new Scanner(System.in);

    void run(){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0) solve(n);
	}
    }

    void solve(int n){
	int[] b = new int[n];
	int i;
	for(i=0; i<b.length; i++){
	    b[i] = kbd.nextInt();
	}
	Arrays.sort(b);
	if(n<6){
	    System.out.println("0");
	}
	else{
	    int ans = 0;
	    int cnt = 0;
	    for(i=n-1; cnt<6; i--){
		ans += b[i];
		cnt++;
	    }
	    System.out.println(ans);
	}
    }
}