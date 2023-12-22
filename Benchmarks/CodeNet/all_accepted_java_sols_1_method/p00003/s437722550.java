import java.util.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);
	int[] a = new int[3];

	while(sc.hasNext()){
	    int n = sc.nextInt();
	    for(int cs = 0; cs < n; cs++){
		for(int i = 0; i < 3; i++){
		    a[i] = sc.nextInt();
		    a[i] *= a[i];
		}
		Arrays.sort(a);
		String s = "NO";
		if(a[0]+a[1] == a[2]) s = "YES";
		System.out.println(s); 
	    }
	}
    }
    public static void main(String[] args){
	new Main();
    }
}