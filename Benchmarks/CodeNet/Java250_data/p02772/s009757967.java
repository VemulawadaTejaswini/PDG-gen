import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    List<Integer> A = new ArrayList<Integer>();
    String result = "APPROVED";

    int N = scan.nextInt();
    for(int i=0;i<N;i++) {
    A.add(scan.nextInt());
    }

for(int j:A) {
	if(j%2==0) {
		if(j%3!=0 && j%5!=0){
		result = "DENIED";
		}
	}

}
    System.out.println(result);
  }
}