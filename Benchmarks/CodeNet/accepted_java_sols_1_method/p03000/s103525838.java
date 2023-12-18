import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        String[] input1;
        String[] input2;
		try (Scanner sc = new Scanner(System. in)) {
		input1 = sc.nextLine().split(" ");
        input2 = sc.nextLine().split(" ");
        }
      
      int N = Integer.parseInt(input1[0]);
      int X = Integer.parseInt(input1[1]);
      int sum=0;
      int ans=1;
      
      for (int i=0;i<N;i++) {
          sum += Integer.parseInt(input2[i]);
          if (X >= sum) {
            ans+=1;
          }
      }
      System.out.println(ans);
	}
}
