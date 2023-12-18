import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		int[] point = new int[n];
		for(int i=0; i<n; i++) {
		    for(int j=0; j<5; j++){
			point[i] += kbd.nextInt();
		    }
		}

		int max = point[0];
		int min = point[0];
		
		for(int i=0; i<n; i++){
		    if(point[i] > max) max = point[i];
		    if(point[i] < min) min = point[i];
		}

		System.out.println(max+" "+min);
	    }
	}
    }
}