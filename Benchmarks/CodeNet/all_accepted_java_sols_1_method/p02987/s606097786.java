import java.util.*;

public class Main {

    public static void main(String[] args) {
        //
        //Compute c1=new Compute();//計算系
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //int answer = 0;
        String answer="No";
        //StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //入力
        Scanner sc = new Scanner(System.in);
        String S=sc.next();
        String s[]=new String[4];
        String ss="";
        String sss="";
        int count1=0;
        int count2=0;
        for (int i=0;i<4;++i)
        {
            s[i]=S.substring(i,i+1);
            if (i==0){ss=s[i]; ++count1;}
            else
            {
                if (ss.equals(s[i])) {++count1;}
                else if(sss.equals("")) { sss=s[i]; ++count2;}
                else if (sss.equals(s[i])) {++count2;}
            }
        }

        if (count1==2 && count2==2) {answer="Yes";}

        //出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        System.out.println(answer);
    }
}