import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	ArrayList<Integer> value = new ArrayList<Integer>();
	ArrayList<Integer> cost = new ArrayList<Integer>();

	for (int i=0; i<N ; i++){
		int v = sc.nextInt();
		value.add(v);
	}

	for (int i=0; i<N ; i++){
		int c = sc.nextInt();
		cost.add(c);
	}

	int total=0;
	for (int i = 0; i<N; i++){
		int sub = value.get(i)-cost.get(i);
		if(sub>0){
			total+=sub;
		}
	}
	System.out.println(total);
  }
}