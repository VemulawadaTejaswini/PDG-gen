import java.util.*;
class Main
{
    public static void main(String [] args)
    {
        Map<String,Integer> map =new HashMap<>();
        Scanner  sc =new Scanner(System.in);
        int red = sc.nextInt();
        int green = sc.nextInt();
        int  blue = sc.nextInt();
        int k = sc.nextInt();
        int time = (int)(Math.pow(2,k));
        if(green > red && blue >green)
        {
            System.out.println("Yes");
        }
        else
        {
            int total = 0;
           if(green<=red)
            {
                while(!(green>red))
                {
                    green = green*2;
                    total++;
                }
            }
            if(blue<=green)
            {
                while(!(blue>green))
                {
                    blue = blue*2;
                    total++;
                }
            }
            if(total<=k)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

    }
}