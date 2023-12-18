import java.util.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int[] w = new int[10];
	    int[] k = new int[10];
	    int tw = 0, tk = 0;

	    for(int i = 0; i < 10; i++) w[i] = sc.nextInt();
	    for(int j = 0; j < 10; j++) k[j] = sc.nextInt();

	    Arrays.sort(w);
	    Arrays.sort(k);
	    for(int i = 0; i < 3; i++){
		tw += w[9-i];
		tk += k[9-i];
	    }

	    System.out.println(Integer.toString(tw)+" "+Integer.toString(tk));
	}
    }

    public static void main(String[] args){
	new Main();
    }
}