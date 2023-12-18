import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int t = kbd.nextInt();
	    int p = kbd.nextInt();
	    int r = kbd.nextInt();
	    if(t!=0 && p!=0 && r!=0){
		int[][] times = new int[t][p];
		int[][] score = new int[t][3];//0チーム、1正答数、2タイム
		int i, j;
		for(i=0; i<t; i++){
			score[i][0] = i+1;
		}

		//ここからログ読み出し
		while(r>0){
		    int tN = kbd.nextInt();
		    int pN = kbd.nextInt();
		    int tT = kbd.nextInt();
		    String mm = kbd.next();

		    if(mm.equals("CORRECT")){
			times[tN-1][pN-1] += tT;
			score[tN-1][1] += 1;
			score[tN-1][2] += times[tN-1][pN-1];
			//System.out.println(score[tN-1][0]+" "+score[tN-1][1]+" "+score[tN-1][2]);
		    }
		    else{
			times[tN-1][pN-1] += 1200;
		    }
		    r--;
		}

		sort(score, t);
		for(i=0; i<t; i++){
		    System.out.println(score[i][0]+" "+score[i][1]+" "+score[i][2]);
		}
	    }
	}
    }

    static void sort(int[][] score, int t){
	int[] c = new int[3];
	int i=0, j=0;
	for(; i<t; i++){
	    int max = i;
	    for(j=i; j<t; j++){
		if(score[max][1]<score[j][1]) max=j;
		else if(score[max][1]==score[j][1]){
		    if(score[max][2]>score[j][2]) max=j;
		    else if(score[max][2]<score[j][2]) ;
		    else {
			if(score[max][0]>score[j][0]) max=j;
		    }
		}	    
		else ;
	    }
	    c = score[i];
	    score[i] = score[max];
	    score[max] = c;
	}
    }
}