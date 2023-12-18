import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    int k = kbd.nextInt();
	    boolean answer = true;
	    int i;

	    if(n!=0 && k!=0){
		int[] blood = new int[k];
		for(i=0; i<blood.length; i++){
		    blood[i] = kbd.nextInt();
		}
		for(; n>0; n--){
		    for(i=0; i<blood.length; i++){
			blood[i] -= kbd.nextInt();
			if(blood[i]<0) answer = false;
		    }
		}
		if(answer) System.out.println("Yes");
		else System.out.println("No");
	    }
	}
    }
}
			  