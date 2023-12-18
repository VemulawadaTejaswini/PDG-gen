import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){

	    double a = sc.nextDouble();

	    double sum = 0;

	    for(int i=2; i<=10; i++){
		sum+=a;
		if(i%2==0){a = a*2;}
		else {a = a/3;}
	    }
	    sum+=a;
	    System.out.println(sum);
	}
    }
}