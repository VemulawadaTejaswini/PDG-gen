
import java.util.*;
class Main
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext())
        {
            int pts[]={0,0};
            String txt =sc.nextLine();
            for(int i=0; i<txt.length(); i++)
            {
                switch(txt.charAt(i))
                {
                    case '(':
                        pts[0]++;
                        break;
                    case ')':
                        pts[0]--;
                        break;
                    case '[':
                        pts[1]++;
                        break;
                    case ']':
                        pts[1]--:
                        break;
                }
                if(pts[0]<0 || pts[1]<0)
                {
                    System.out.println("no");
                }
            }
            if(pts[0]==0 && pts[1]==0)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
        sc.close();
    }
}