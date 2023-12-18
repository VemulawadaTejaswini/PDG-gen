import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[][] points;
    int[] sum, unique;

    void run(){
	int n = sc.nextInt();
	points = new int[n][3];
	sum = new int[n];
	unique = new int[201];
	int i=0;
	int p=0;
	for(p=0; p<n; p++){
	    for(i=0; i<3; i++){
		points[p][i] = sc.nextInt();
		//System.out.print(points[p][i]+" ");	    
	    }
	    //System.out.println();
	}
	  
	i=0;
	while(i<3){
	    for(p=0; p<n; p++){
		unique[points[p][i]]++;
	    }
	    for(p=0; p<n; p++){
		if(unique[points[p][i]]==1)
		    sum[p] += points[p][i];
		//System.out.println("*"+sum[i]);
		unique[points[p][i]] = 0;
	    }
	    i++;
	}
	for(i=0; i<sum.length; i++){
	    System.out.println(sum[i]);
	}	
    }
}