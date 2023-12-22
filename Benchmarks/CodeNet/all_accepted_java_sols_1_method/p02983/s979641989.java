import java.util.*;

public class Main {

    public static void main(String[] args) {
        //
        //Compute c1 = new Compute();//計算系
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        int answer = 0;
        //String answer="No";
        //StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //入力
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        Set<Integer> set=new HashSet<>();

        for (int i=l;i<=r;++i)
        {
            set.add(i%2019);
            if (set.size()==2019) {break;}
        }

        int a[]=new int[set.size()];
        int ind=0;
        for (int i:set)
        {
            a[ind]=i;
            ++ind;
        }

        for (int i=0;i<a.length;++i)
        {
            for (int j=i+1;j<a.length;++j)
            {
                min=Math.min(min,(a[i]*a[j])%2019);
            }
        }
        answer=min;
        //出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        System.out.println(answer);
    }
}