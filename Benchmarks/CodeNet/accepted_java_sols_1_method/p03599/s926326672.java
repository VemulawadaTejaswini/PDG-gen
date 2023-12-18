import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int A = scan.nextInt();
	int B = scan.nextInt();
	int C = scan.nextInt();
	int D = scan.nextInt();
	int E = scan.nextInt();
	int F = scan.nextInt();

	double max = -1;
	int max_water = 0;
	int max_suger = 0;
	for(int i = 0; 100*A*i <= F; i++){
	    for(int j = 0; 100*A*i+100*B*j <= F; j++){
		for(int k = 0; 100*A*i+100*B*j+C*k <= F; k++){
		    for(int l = 0; 100*A*i+100*B*j+C*k+D*l <= F; l++){
			if((A*i+B*j)*E < C*k+D*l){
			    //砂糖多すぎ
			}else{
			    double tmp = (double)100*(C*k+D*l)/(100*A*i+100*B*j+C*k+D*l);
			    if(tmp > max){
				max = tmp;
				max_water = 100*A*i+100*B*j+C*k+D*l;
				max_suger = C*k+D*l;
			    }
			}
		    }
		}
	    }
	}

	System.out.println(max_water+" "+max_suger);
    }
}
