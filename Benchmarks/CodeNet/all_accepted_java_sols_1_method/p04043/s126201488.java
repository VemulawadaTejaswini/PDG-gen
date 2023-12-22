import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String moji=sc.nextLine();
        String[] moji2=moji.split(" ");
        int[] moji3=new int[3];
        int five=0;
        int seven=0;
        for(int i=0;i<3;i++)
        {
            moji3[i]=Integer.parseInt(moji2[i]);
        }
        for(int j=0;j<3;j++)
        {
            if(moji3[j]==5)
            {
                five++;
            }
            else if(moji3[j]==7)
            {
                seven++;
            }
        }
        if(five==2&&seven==1)
        {
            System.out.println("YES");
        }
        else 
        {
            System.out.println("NO");
        }
    }
}