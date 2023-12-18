import java.util.*;

	public class Main {

		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
          if(!(String.valueOf(i).length()%2==0)){
            sum++;
          }
        }
          System.out.println(sum);
	}
}