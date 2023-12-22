import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int Y = sc.nextInt();
	
    int resA = -1, resB = -1, resC = -1;
	int tmpMoney = 0;
	boolean isTruth = false;
	
	for (int a=0; a<=N; a++){
	  for (int b=0; b<=N-a; b++){
	    int c = N - a - b;
	    tmpMoney = 10000*a + 5000*b + 1000*c;
	    if(tmpMoney == Y){
	      resA = a;
          resB = b;
          resC = c;
          isTruth = true;
	      break;
	    }
	  }
      if(isTruth)
        break;
	}
	
	System.out.println(resA + " " + resB + " " + resC);
  }
}