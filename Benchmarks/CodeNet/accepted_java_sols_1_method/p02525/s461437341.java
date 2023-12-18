import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	while (true){
    		int n = sc.nextInt();
    	double sum = 0;
    		if (n==0)
    	break;
    	int [] points = new int [n];
    		for (int i = 0; i< points.length;i++){
    			points[i]=sc.nextInt();
    		sum+=points[i];
    		}
    	double ave = 0;
    	double var = 0;
    		ave = sum/n;
    		for (int j = 0; j< points.length;j++){
    			var+=(points[j]-ave)*(points[j]-ave)/n;
    		}
    		System.out.println(Math.sqrt(var));
    	}
    }
}