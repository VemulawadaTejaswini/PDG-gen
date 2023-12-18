import java.util.*;

class Main{
    int a,b;
    ArrayList<Integer> a1,b1;

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    a = sc.nextInt();
	    b = sc.nextInt();
	    if(a==0 && b==0) break;

	    a1 = new ArrayList<Integer>();
	    b1 = new ArrayList<Integer>();
	    for(int i=1; i<=a; i++){
		if(a%i==0) a1.add(i);
	    }
	    for(int i=1; i<=b; i++){
		if(b%i==0) b1.add(i);
	    }

	    int min = Integer.MAX_VALUE;
	    for(int i=0; i<a1.size(); i++){
		int a2 = a/a1.get(i);
		for(int j=0; j<b1.size(); j++){
		    int b2 = b/b1.get(j);
		    int[] data = {a1.get(i),a2,b1.get(j),b2};
		    Arrays.sort(data);
		    int square = (data[1]-data[0])*(data[1]-data[0])+(data[2]-data[1])*(data[2]-data[1])+(data[3]-data[2])*(data[3]-data[2]);
		    min = Math.min(min,square);
		}
	    }

	    System.out.println(min);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}