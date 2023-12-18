import java.util.*;

public class Main
{
    static int h;
    static int w;
    static int n;
    static int power;
    static int dx[]={0,-1,1,0};
    static int dy[]={-1,0,0,1};
    static Node startNode;
    static int dist[][];
    static String field[][];
    static boolean visit[][];
    static Queue<Node> nodeQueue=new ArrayDeque<>();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        h=sc.nextInt();
        w=sc.nextInt();
        n=sc.nextInt();
        String s[]=new String[h];
        field=new String[h+2][w+2];
        visit=new boolean[h+2][w+2];
        dist=new int[h+2][w+2];
        power=1;
        int answer=0;

        for (int i=0;i<h;++i) { s[i]=sc.next();}
        for (int i=0;i<h+2;++i)
        {
            for (int j=0;j<w+2;++j)
            {
                if (i==0 || j==0 || j==w+1 || i==h+1) {field[i][j]="X";}
                else
                {
                    field[i][j]=s[i-1].substring(j-1,j);
                    if (field[i][j].equals("S")) { startNode=new Node(i,j); }
                    visit[i][j]=false;
                }
            }
            //System.out.println(Arrays.toString(field[i]));
        }

        for (int i=0;i<n;++i)
        {
            dfs();
            answer+=dist[startNode.getIdX()][startNode.getIdY()];
            ++power;
        }
        System.out.println(answer);
    }

    public static void dfs()
    {
        for (int i=0;i<h+2;++i) { for (int j=0;j<w+2;++j) { dist[i][j]=-1; } }
        nodeQueue.clear();
        dist[startNode.getIdX()][startNode.getIdY()]=0;
        nodeQueue.add(startNode);

        while (!nodeQueue.isEmpty())
        {
            Node node=nodeQueue.poll();
            for (int i=0;i<dx.length;++i)
            {
                int nx=node.getIdX()+dx[i];
                int ny=node.getIdY()+dy[i];
                Node node1=new Node(nx,ny);
                if (!field[nx][ny].equals("X") && dist[nx][ny]==-1)
                {
                    dist[nx][ny]=dist[node.getIdX()][node.getIdY()]+1;
                    if (!field[nx][ny].equals(".") && !field[nx][ny].equals("S"))
                    {
                        int needPower=Integer.parseInt(field[nx][ny]);
                        if (needPower<=power && !visit[nx][ny])
                        {
                            visit[nx][ny]=true;
                            startNode=node1;
                            return;
                        }else { nodeQueue.add(node1); }
                    }else { nodeQueue.add(node1); }
                }
            }
        }
    }
}

class Node
{
    int idX;
    int idY;
    public Node(int i,int j)
    {
        this.idX=i;
        this.idY=j;
    }

    public int getIdX() {return this.idX;}
    public int getIdY() {return this.idY;}
}
