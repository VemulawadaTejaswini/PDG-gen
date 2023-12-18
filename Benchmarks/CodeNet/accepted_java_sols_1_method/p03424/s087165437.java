import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    String scores[] = new String[N];
    for (int count = 0; count < N; count++){
      String a = sc.next();
      scores[count] = a;
    }
		if(Arrays.asList(scores).contains("P") && Arrays.asList(scores).contains("W") &&
		Arrays.asList(scores).contains("G") && Arrays.asList(scores).contains("Y")){System.out.println("Four");}
		else{System.out.println("Three");}
   }
 }
