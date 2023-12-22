import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int ans;
	String[] S;

	Main(){
		switch(sc.next()){
			case "Sunny":
				System.out.println("Cloudy");
				break;
			case "Cloudy":
				System.out.println("Rainy");
				break;
			case "Rainy":
				System.out.println("Sunny");
				break;
        }
	}

	public static void main(String[] args){
		new Main();
	}
}