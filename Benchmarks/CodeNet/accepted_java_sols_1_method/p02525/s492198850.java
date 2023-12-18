import java.util.Scanner; 
 
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	while(true){
	    int n = sc.nextInt();
	    if(n == 0){
		break;
	    }
	    int[] scores = new int[n];
	    double ave1 = 0, ave2 = 0, variance = 0;
	    for(int i = 0; i < scores.length; i++){
		scores[i] = sc.nextInt();
		ave1 += scores[i];
		ave2 += scores[i] * scores[i];
	    }
	    ave1 /= n;
	    ave1 *= ave1;
	    ave2 /= n;
	    variance = ave2 - ave1; 
	    System.out.println(Math.sqrt(variance));
	}
    }
}