import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String[] line = sc.next().split(",");
	    int[] dist = new int[10];
	    int sum = 0;
	    int i=0;
	    for(i=0; i<dist.length; i++){
		dist[i] = Integer.parseInt(line[i]);
		sum += dist[i];
	    }
	    double[] v = new double[2];
	    v[0] = Double.parseDouble(line[i]);
	    v[1] = Double.parseDouble(line[++i]);

	    double rate = v[0]/(v[0]+v[1]);
	    //System.out.println(rate);
	    double dist2 = (double)sum*rate;

	    int ans = 0;
	    sum = 0;
	    for(i=0; i<dist.length; i++){
		if(dist2>=sum && dist2<=sum+dist[i]){ans = i; break;}
		sum += dist[i];
	    }

	    System.out.println(ans+1);
	}
    }
}