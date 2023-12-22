import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();    
    int d = sc.nextInt();    
    int e = sc.nextInt();    
    int K = sc.nextInt();    

	if(K>=b-a && K>=c-a && K>=d-a && K>=e-a && K>=c-b && K>=d-b && K>=e-b && K>=d-c && K>=e-c && K>=e-d){
		System.out.println("Yay!");
	}else{
		System.out.println(":(");
	}
	}
}