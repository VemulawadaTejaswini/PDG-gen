import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext())
        {    
            int[][] areaArray = new int[21][21];
            int n = scan.nextInt();
            if(n==0)
                break;
            //宝石の場所
            for(int i=0;i<n;i++)
            {
                int x1 = scan.nextInt();
                int y1 = scan.nextInt();
                areaArray[y1][x1]=1;
            }
            int total = n;
            int getCount = 0;
            
            //ロボットの初期位置
            int x2 = 10;
            int y2 = 10;
            //ロボットにする命令
            int m = scan.nextInt();
            for(int i=0;i<m;i++)
            {
                String direct = scan.next();
                int kyori = scan.nextInt();

                //北に進む
                if(direct.equals("N"))
                {
                    for(int j=0;j<kyori;j++)
                    {
                        y2++;
                        if(areaArray[y2][x2]==1)   
                        {
                            getCount++;
                            areaArray[y2][x2]=0;
                        }
                    }
                }
                //東に進む
                else if(direct.equals("E"))
                {
                    for(int j=0;j<kyori;j++)
                    {
                        x2++;
                        if(areaArray[y2][x2]==1)   
                        {
                            getCount++;
                            areaArray[y2][x2]=0;
                        }
                    }
                }
                //南に進む
                else if(direct.equals("S"))
                {
                    for(int j=0;j<kyori;j++)
                    {
                        y2--;
                        if(areaArray[y2][x2]==1)   
                        {
                            getCount++;
                            areaArray[y2][x2]=0;
                        }
                    }
                }
                //西に進む
                else if(direct.equals("W"))
                {
                    for(int j=0;j<kyori;j++)
                    {
                        x2--;
                        if(areaArray[y2][x2]==1)   
                        {
                            getCount++;
                            areaArray[y2][x2]=0;
                        }
                    }
                }
            }
            if(total==getCount)
                System.out.println("Yes");
            else
                System.out.println("No");
            
        }
    }
}