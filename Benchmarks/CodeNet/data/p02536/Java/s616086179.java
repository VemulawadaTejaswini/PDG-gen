import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
      	int Road[] = new int[n];
      	int i = 0;
      	for(i = 0;i < m * 2;i++){
		  Road[sc.nextInt()-1] += 1;
        }
          System.out.println(Road[1]);
    }
}
