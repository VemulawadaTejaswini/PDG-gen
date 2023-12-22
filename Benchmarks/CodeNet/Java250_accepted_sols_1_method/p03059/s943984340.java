import java.util.*;

public class Main {

    public static void main(String[] args) {
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int answer=0;

        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        int array1[] = new int[5];
        int array2[] = new int[5];

        //入力
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();

        //処理
        int a=T/A;
        //System.out.println(a);
        int b=B*a;
        answer=b;

        //Collections.sort(a);
        //System.out.println(Arrays.toString(list1.toArray()));
        //System.out.println(Arrays.toString(array1));
		//System.out.println(Arrays.deepToString(a));
        System.out.println(answer);
    }
}