import java.util.*;



class Main{

    public static void main(String[] args){

	int gyo,retu,n;
	String sc;
	Scanner in = new Scanner(System.in);


	gyo = in.nextInt();
	retu = in.nextInt();
	n = in.nextInt();
	int[][] jm = new int[gyo+1][retu+1];
	int[][] om = new int[gyo+1][retu+1];
	int[][] im = new int[gyo+1][retu+1];
	for(int i=0;i<=gyo;i++){
	    for(int j=0;j<=retu;j++){
		jm[i][j]=0;
		om[i][j]=0;
		im[i][j]=0;
	    }
	}

	//Arrays.fill(jm,0); //memsetツ的ツづ按閉ィ
	//Arrays.fill(om,0);
	//Arrays.fill(im,0);

	for(int i=1;i<=gyo;i++){
	    sc = in.next();
	    for(int j=0;j<retu;j++){
		char cc[] = sc.toCharArray();
		jm[i][j+1]=jm[i-1][j+1]+jm[i][j]-jm[i-1][j];
		om[i][j+1] = om[i-1][j+1]+om[i][j]-om[i-1][j];
		im[i][j+1]=im[i-1][j+1]+im[i][j]-im[i-1][j];
		if(cc[j] == 'J'){
		    jm[i][j+1]++;
		}else if(cc[j] == 'O'){
		    om[i][j+1]++;
		}else if(cc[j] == 'I'){
		    im[i][j+1]++;
		}


	    }
	}

	/*	
		for(int i=0;i<=gyo;i++){
		for(int j=0;j<=retu;j++)System.out.print(jm[i][j] + " ");
		System.out.printf("\n");
		}
	*/
	
	int a,b,c,d;
	for(int i=0;i<n;i++){
	    a = in.nextInt();
	    b = in.nextInt();
	    c = in.nextInt();
	    d = in.nextInt();
	    System.out.print(jm[c][d]-jm[a-1][d]-jm[c][b-1]+jm[a-1][b-1]);
	    System.out.print(" ");
	    System.out.print(om[c][d]-om[a-1][d]-om[c][b-1]+om[a-1][b-1]);
	    System.out.print(" ");
	    System.out.println(im[c][d]-im[a-1][d]-im[c][b-1]+im[a-1][b-1]);

	}
	


    }


}