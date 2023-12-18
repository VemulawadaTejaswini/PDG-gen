import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    String[] time;
    int[] in;
    int[] out;
    int atOsaki;
    int outOsaki;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n!=0){
		atOsaki = 0;
		outOsaki = 0;
		in = new int[n];
		out = new int[n];
		solve();
		System.out.println(atOsaki+outOsaki);
	    }
	}
    }

    void solve(){
	for(int i=0; i<n; i++){
	    time = sc.next().split(":");
	    out[i] = 
		Integer.parseInt(time[0])*3600 +
		Integer.parseInt(time[1])*60 +
		Integer.parseInt(time[2]);
	    time = sc.next().split(":");
	    in[i] =
		Integer.parseInt(time[0])*3600 +
		Integer.parseInt(time[1])*60 + 
		Integer.parseInt(time[2]);
	    //System.out.println("*"+out[i]+" "+in[i]);
	}
	Arrays.sort(out);
	Arrays.sort(in);

	int Idx = 0;
	int Odx = 0;
	while(Idx<in.length || Odx<out.length){
	    //System.out.println(outOsaki+" "+atOsaki);
	    if(Odx==out.length){
		arrive();
		Idx++;	 
	    }
	    else if(out[Odx] < in[Idx]){
		leave();
		Odx++;
	    }
	    else{
		arrive();
		Idx++;
	    }
	}
    }

    void leave(){
	if(atOsaki>0) atOsaki--;
	outOsaki++;
    }

    void arrive(){
	outOsaki--;
	atOsaki++;
    }
}
		