import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        //変数
        int count=0;
        boolean sw=false;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        String answer=null;
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        int array1[]=new int[5];
        int array2[]=new int[5];

        //入力
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        //処理
        if(C>A && B>C)
        {
            answer="Yes";
        }
        else if(C>B && A>C)
        {
            answer="Yes";
        }
        else
        {
            answer="No";
        }
        //Collections.sort(a);
        //System.out.println(Arrays.toString(list1.toArray()));
        //System.out.println(Arrays.toString(array1));
		//System.out.println(Arrays.deepToString(a));
        System.out.println(answer);
    }
}