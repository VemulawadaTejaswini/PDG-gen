import java.util.*;

public class Main {
	public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        int answer = 0;
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i = L; i <= R; i++) {
            numList.add(i);
        }

        for (int j: numList){
            if (j%d == 0){
                answer += 1;
            }
          }

        System.out.println(answer);
      
      }
}