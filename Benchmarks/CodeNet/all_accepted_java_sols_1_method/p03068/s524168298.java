import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        //変数
        int count=0;
        boolean sw=false;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        String answer="";
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        int array1[]=new int[5];
        int array2[]=new int[5];
        List<String> slist=new ArrayList<>();
        //入力
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String S=sc.next();
        int K=sc.nextInt();
        //処理
        String s1=null;
        s1=S.substring(K-1,K);
        String s2="*";
        for(int i=0;i<N;i++)
        {
            String s3=S.substring(i,i+1);
            if(s1.equals(s3))
            {
                answer+=s3;
            }
            else
            {
                answer+=s2;
            }
        }
        //System.out.println(s1);
        //Collections.sort(a);
        //System.out.println(Arrays.toString(list1.toArray()));
        //System.out.println(Arrays.toString(array1));
		//System.out.println(Arrays.deepToString(a));
        System.out.println(answer);
    }
}