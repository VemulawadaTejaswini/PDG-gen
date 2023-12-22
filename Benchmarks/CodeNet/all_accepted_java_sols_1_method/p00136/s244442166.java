import java.util.Scanner;

public class Main{
    double[] hgt = {185.0, 180.0, 175.0, 170.0, 165.0, 0.0};

    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int n = sc.nextInt();
	    if(n == 0) break;
	    String[] str = new String[6];
	    for(int i = 5; i >= 0; i--)
		str[i] = Integer.toString(6-i)+":";

	    for(int i = 0; i < n; i++){
		double t = sc.nextDouble();
		for(int j = 0; j < 6; j++)
		    if(t >= hgt[j]){
			str[j] += "*";
			break;
		    }
	    }

	    for(int i = 5; i >= 0; i--)
		System.out.println(str[i]);
	}
    }

    public static void main(String[] args){
	new Main();
    }
}