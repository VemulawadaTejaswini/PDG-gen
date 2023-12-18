import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int a = sc.nextInt();
	int b = sc.nextInt();

	int kiji = sc.nextInt();
	int[] top = new int[n];
	String binary = "";
	for(int i=0; i<n; i++){
	    top[i] = sc.nextInt();
	    binary += "1";
	}

	int num = Integer.parseInt(binary,2);
	double mincost = Double.MIN_VALUE;
	int cost = a;
	int cal = kiji;
	while(num!=-1){
	    //System.out.println(mincost);
	    binary = Integer.toBinaryString(num);
	    int length = binary.length();
	    cost = a;
	    cal = kiji;
	    for(int j=0; j<binary.length(); j++){
		int num2 = Integer.parseInt(binary.substring(length-1-j,length-j));
		if(num2==1){
		    cost += b;
		    cal += top[j];
		}
	    }
	    if((double)cal/cost>mincost){mincost = (double)cal/cost; mincost%=10000;}
	    num--;
	}

	System.out.println((int)mincost);
    }
}