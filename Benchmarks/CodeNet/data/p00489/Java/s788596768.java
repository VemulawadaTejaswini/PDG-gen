import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int[] team = new int[n];

	int num = n*(n-1)/2;
	for(int i=0; i<num; i++){
	    int a = sc.nextInt()-1;
	    int b = sc.nextInt()-1;
	    int scoreA = sc.nextInt();
	    int scoreB = sc.nextInt();

	    if(scoreA>scoreB){
		team[a] += 3;
	    }else if(scoreA<scoreB){
		team[b] += 3;
	    }else {
		team[a]++;
		team[b]++;
	    }
	}
	
	int[] rank = new int[n];
	int max = 0;
	int maxIndex = 0;	
	int ranking = 1;
	int lastmax = 0;
	int count = 0;
	for(int j=0; j<n; j++){
	    count++;
	    lastmax = max;
	    max = 0;
	    for(int i=0; i<n; i++){
		if(max<team[i]){max = team[i]; maxIndex = i;}
	    }
	    if(lastmax!=max)ranking = count;
	    rank[maxIndex] = ranking;
	    team[maxIndex] = -1;
	}
	for(int i=0; i<n; i++){
	    System.out.println(rank[i]);
	}
    }
}