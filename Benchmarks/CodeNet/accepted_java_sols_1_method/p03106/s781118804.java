import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();

        sc.close();

        //A<BとおいてAの数だけAとBの約数を求める

        ArrayList<Integer> factoringA = new ArrayList<>();
        ArrayList<Integer> factoringB = new ArrayList<>();

        if (A > B) {int temp = A; A=B; B = temp;}

        for(int n = 1; n < A+1 ; n++) {

            if(A % n == 0) {

                factoringA.add(n);
            }

            if(B % n == 0) {

                factoringB.add(n);
            }
        }

        //公約数のリスト
        List<Integer> commonDivisorList = new ArrayList<>();

        //Aの約数の数だけループさせる
        for (int a = 0; a < factoringA.size(); a++ ) {

            for (int b = 0; b < factoringB.size(); b++) {

                if (factoringA.get(a).equals(factoringB.get(b))) {

                    commonDivisorList.add(factoringA.get(a));
                }
            }
        }
        //commonDivisorListは昇順 => -(-commonDivisorList + K)番目が最大公約数からK番目に大きい数
        System.out.println(commonDivisorList.get(commonDivisorList.size() - K));

    }
}