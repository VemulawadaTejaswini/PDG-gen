import java.util.Scanner;

public class Main  {
    static int sum(int[] arr){
	int res = 0;
	for(int i=0; i<arr.length;++i){
	    res += arr[i];
	}
	return res;
    }
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	while(true){
	    int n = sc.nextInt();
	    if(n == 0)break;
	    int[] s = new int[n];
	    for(int i=0; i<n;++i){
		s[i] = sc.nextInt();
	    }
	
	    int ave = sum(s);
	    int sumofdiff = 0;

	    for(int i=0; i<n;++i){
		sumofdiff += (s[i] - ave) * (s[i] - ave);
	    }
	    sumofdiff /= n;
	
	    double res = Math.sqrt(sumofdiff);
	    System.out.println(res);
	}
	sc.close();
    }
}