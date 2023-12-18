import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	final int WIN = 3, PASS = 1, FAIL = 0, UNKNOWN = 2;
	Scanner scn = new Scanner(System.in);

	int n;

	int den,mon,cab,total;
	byte[] glist;
	int[][] exps;
	boolean[] provedp;

	while(true){
	    den = scn.nextInt();
	    mon = scn.nextInt();
	    cab = scn.nextInt();
	    total = den+mon+cab;

	    if(total == 0)
		break;

	    n = scn.nextInt();

	    glist = new byte[total+1];
	    provedp = new boolean[n];

	    exps = new int[n][4];

	    for(int i=0; i<glist.length; i++)
		glist[i] = UNKNOWN;

	    for(int i=0; i<n; i++) for(int j=0; j<4; j++)
				       exps[i][j] = scn.nextInt();

	    boolean complete = true;

	    while(complete){
		complete = false;
		for(int i=0; i<n; i++)
		    if(provedp[i]){
			continue;
		    }else if(exps[i][WIN] == PASS){
			complete = true;
			for(int j=0; j<3; j++)
			    glist[exps[i][j]] = PASS;
			provedp[i] = true;
		    }else{
			int cnt = 0;
			for(int j=0; j<3; j++)
			    if(glist[exps[i][j]] == PASS)
				cnt++;

			if(cnt == 2){
			    complete = true;
			    for(int j=0; j<3; j++)
				if(glist[exps[i][j]] == UNKNOWN)
				    glist[exps[i][j]] = FAIL;
			    provedp[i] = true;
			}else{
			    for(int j=0; j<3; j++)
				if(exps[i][j] == FAIL){
				    provedp[i] = true;
				    complete = true;
				}
			}
		    }
	    }

	    for(int i=1 ; i<=total; i++){
		System.out.println(glist[i]);
	    }
	}

	
    }
}