import java.util.*;

class Main{
    static int[][] field;
    static int w,h;
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	while(n!=0){

	    w = sc.nextInt();
	    h = sc.nextInt();

	    field = new int[n][2];
	    for(int i=0; i<n; i++){
		field[i][0] = sc.nextInt();//ØÌxÀW
		field[i][1] = sc.nextInt();//ØÌyÀW
	    }

	    int s = sc.nextInt();
	    int t = sc.nextInt();

	    int count = 0;
	    int max = 0;
	    for(int i=1; i<=h; i++){//ÍÍð1¸Â¸ç·
		for(int j=1; j<=w; j++){
		    count = 0;
		    for(int k=0; k<n; k++){
			if(field[k][0]>=j && field[k][0]<=j+s-1//ÍÍàÉ êÎ 
			   && field[k][1]>=i && field[k][1]<=i+t-1)count++;
		    }
		    if(count>max)max = count;
		}
	    }	   
	    
	    System.out.println(max);

	    n = sc.nextInt();
	}
    }
}