import java.util.*;
import java.lang.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	int num = sc.nextInt();
      	double[] ary = new double[num];
      	for(int i = 0; i < num; i++){
      		ary[i] = sc.nextDouble();
      	}
      	Arrays.sort(ary);
  		double result = ary[0];
      	for(int j = 1; j < num; j++){
          result = (result + ary[j])/2.0;
      	}
      	System.out.println(result);
  	}
}