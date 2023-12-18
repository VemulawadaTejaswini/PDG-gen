import java.util.*;
public class Main
{
    static boolean used[];
    static Point rec[][];
    static double EPS=1e-5;
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        for(;;)
        {
            int N=in.nextInt();
            if(N==0)
                return;
            while(N-->0)
            {
                int n=in.nextInt();
                rec=new Point[n][4];
                used=new boolean[n];// true is used...
                for(int i=0;i<n;i++)
                    for(int j=0;j<4;j++)
                        rec[i][j]=new Point(in.nextDouble(), in.nextDouble());
 
                int cnt=0;
                for(int i=0;i<n;i++)
                {
                    if(!used[i])
                    {
                        ++cnt;
                        dfs(i);
                    }
                }
                System.out.println(cnt);
            }
        }
    }
 
    static void dfs(int now)
    {
        used[now]=true;
        for(int i=0;i<used.length;i++)
        {
            if(!used[i])
            {
                boolean go=false;
                //交差判定(境界含む)
                for(int j=0;j<4;j++)
                    for(int k=0;k<4;k++)
                    {
                        if(Point.lineCross(rec[now][j], rec[now][(j+1)%4],rec[i][k] , rec[i][(k+1)%4]))
                            go=true;    
                    }
                for(int k=0;k<4;k++)
                {
                    if(Point.ccw(rec[now][0],rec[i][k],rec[now][1])==1&&Point.ccw(rec[now][1],rec[i][k],rec[now][2])==1&&
                            Point.ccw(rec[now][2],rec[i][k],rec[now][3])==1&&Point.ccw(rec[now][3],rec[i][k],rec[now][0])==1
                            ||Point.ccw(rec[now][0],rec[i][k],rec[now][1])==-1&&Point.ccw(rec[now][1],rec[i][k],rec[now][2])==-1&&
                            Point.ccw(rec[now][2],rec[i][k],rec[now][3])==-1&&Point.ccw(rec[now][3],rec[i][k],rec[now][0])==-1)
                        go=true;
                }


 for(int k=0;k<n;k++)
                {
                    if(Point.ccw(rec[i][0],rec[now][k],rec[i][1])==1&&Point.ccw(rec[i][1],rec[now][k],rec[i][2])==1&&
                            Point.ccw(rec[i][2],rec[now][k],rec[i][3])==1&&Point.ccw(rec[i][3],rec[now][k],rec[i][0])==1
                            ||Point.ccw(rec[i][0],rec[now][k],rec[i][1])==-1&&Point.ccw(rec[i][1],rec[now][k],rec[i][2])==-1&&
                            Point.ccw(rec[i][2],rec[now][k],rec[i][3])==-1&&Point.ccw(rec[i][3],rec[now][k],rec[i][0])==-1)
                        go=true;
                }

                if(go)
                    dfs(i);
            }
        }
    }
    static public void debug(Object... o)
    {
        System.err.println(Arrays.deepToString(o));
    }
}
 
class Point
{
    double x;
    double y;
    static double EPS=1e-5;
    Point(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
 
    //線分p1-p2と線分p3-p4が交差しているかを判定 true->交差(=含みで接する含む) false->交差せず
    static boolean lineCross(Point p1,Point p2,Point p3,Point p4)
    {
        double a=(p1.x-p2.x)*(p3.y-p1.y)+(p1.y-p2.y)*(p1.x-p3.x);
        double b=(p1.x-p2.x)*(p4.y-p1.y)+(p1.y-p2.y)*(p1.x-p4.x);
        double c=(p3.x-p4.x)*(p1.y-p3.y)+(p3.y-p4.y)*(p3.x-p1.x);
        double d=(p3.x-p4.x)*(p2.y-p3.y)+(p3.y-p4.y)*(p3.x-p2.x);
        return a*b<=EPS && c*d<=EPS;
    }
 
    //counterClockWise p1->p2->p3が反時計周りなら1 時計周りなら-1を返す 
    static double ccw(Point p1,Point p2,Point p3)
    {
        Point a=new Point(p2.x-p1.x, p2.y-p1.y);
        Point b=new Point(p3.x-p1.x, p3.y-p1.y);
        if(crossProduct(a, b)>=-EPS) return 1;//counter clockwise
        if(crossProduct(a, b)<=EPS) return -1;//clockwise
        else return 0;
    }
    //外積
    static double crossProduct(Point a,Point b)
    {
        return a.x*b.y-a.y*b.x;
    }
 
    //3頂点からなる三角形の面積
    static double triangleArea(Point p1,Point p2,Point p3)
    {
        return Math.abs((p3.y-p1.y)*(p2.x-p1.x)-(p2.y-p1.y)*(p3.x-p1.x))/2;
    }
}
 
//x>=yの優先度で頂点を昇順ソート
//Arrays.sort(p,new PointComparator());こんな感じで使う
class PointComparator implements Comparator<Point>
{
    public int compare(Point p1,Point p2)
    {
        double cmp=p1.x-p2.x;
        if(cmp==0)
            cmp=p1.y-p2.y;
        if(cmp<0)
            cmp=-1;
        else
            cmp=1;
        return (int) cmp;
    }
}