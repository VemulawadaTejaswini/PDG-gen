import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        //変数
        int count=0;
        boolean sw=false;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int answer=0;
        int tmp=0;
        List<Integer> list1=new ArrayList<>();
        int array1[]=new int[5];
        //入力
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            list1.add(sc.nextInt());
        }
        //処理
        for(int i=0;i<list1.size();i++)
        {
            tmp=list1.get(i);
            //System.out.println(tmp);
            for (int j=i-1;j>=0;j--)
            {
                //System.out.println(j);
                if(tmp<list1.get(j))
                {
                    break;
                }else
                {
                    if(j==0)
                    {
                        count++;
                    }
                }
            }
            if(i==0)
            {
                count++;
            }
            //System.out.println(i);
        }
        answer=count;
        /*
        Collections.sort(a);
        System.out.println(Arrays.toString(a.toArray()));
        //System.out.println(Arrays.toString(X));
		//System.out.println(Arrays.deepToString(a));
        */
        System.out.println(answer);
    }
}