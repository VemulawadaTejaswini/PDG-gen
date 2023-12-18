/**
 * Created by huzhejie on 2016/10/11.
 */
import java.util.*;

public class Main {

    public static void main(String args[])
    {
        int[][] startStatus=new int[3][3];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String s;
        while(count<3){
            s = sc.nextLine();
            startStatus[count][0] = Integer.parseInt(s.split(" ")[0]);
            startStatus[count][1] = Integer.parseInt(s.split(" ")[1]);
            startStatus[count][2] = Integer.parseInt(s.split(" ")[2]);
            count++;
        }
        int[][] endStatus = {{1,2,3},{4,5,6},{7,8,0}};
        Astar test = new Astar(startStatus,endStatus);
        test.run();
    }

}
class Astar
{
    public int[][] startStatus;
    public int[][] endStatus;
    public NodeComparator nodeComparator = new NodeComparator();
    public PriorityQueue<Node> open = new PriorityQueue<Node> (100,nodeComparator);
    public List<Node>  close =new ArrayList<Node> ();
    public Astar(int[][] startStatus, int[][] endStatus )
    {
        this.startStatus = new int[3][3];
        this.endStatus = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                this.startStatus[i][j] = startStatus[i][j];
                this.endStatus[i][j] = endStatus[i][j];
            }
        }
    }

    private void initStart()
    {
        Node startNode = new Node(startStatus);
        startNode.gvalue = 0;
        startNode.parent = null;
        startNode.hvalue = startNode.getHvalue();
//        startNode.fvalue = startNode.gvalue+startNode.hvalue;
        open.add(startNode);
    }
    private boolean isInList(Node lNode,Node newNodeParent)
    {
        //????????\????????????????????¨???????????°?????????????????°???g??? ???????°??????°??¨???g????????????????????????
        //???????????????????????????????????¢?????°
        while(newNodeParent != null)
        {
            if(lNode.equal(newNodeParent.status))
            {
                return true;
            }
            newNodeParent = newNodeParent.parent;
        }
        return false;
    }
    private void initChild(Node newNode,List<Node> newNodeChild)
    {

        int zeroPosition = 0;//from 0 to 8;
        zeroPosition = newNode.getZeroPosition();

        if((zeroPosition%3) !=2)
        {
            Node lNode = new Node(newNode.status);
            lNode.status[zeroPosition/3][zeroPosition%3] = lNode.status[zeroPosition/3][(zeroPosition%3)+1];
            lNode.status[zeroPosition/3][(zeroPosition%3)+1] = 0;
            if(!isInList(lNode,newNode.parent))
            {
                lNode.parent = newNode;
                lNode.gvalue = newNode.gvalue+1;
                lNode.hvalue = lNode.getHvalue();
//                lNode.fvalue = lNode.gvalue+lNode.hvalue;
                newNodeChild.add(lNode);
            }


        }

        if((zeroPosition%3) !=0)
        {
            Node lNode = new Node(newNode.status);
            lNode.status[zeroPosition/3][zeroPosition%3] = lNode.status[zeroPosition/3][(zeroPosition%3)-1];
            lNode.status[zeroPosition/3][(zeroPosition%3)-1] = 0;
            if(!isInList(lNode,newNode.parent))
            {
                lNode.parent = newNode;
                lNode.gvalue = newNode.gvalue+1;
                lNode.hvalue = lNode.getHvalue();
//                lNode.fvalue = lNode.gvalue+lNode.hvalue;
                newNodeChild.add(lNode);
            }


        }

        if((zeroPosition/3) !=2)
        {
            Node lNode = new Node(newNode.status);
            lNode.status[zeroPosition/3][zeroPosition%3] = lNode.status[zeroPosition/3+1][zeroPosition%3];
            lNode.status[zeroPosition/3+1][zeroPosition%3] = 0;
            if(!isInList(lNode,newNode.parent))
            {
                lNode.parent = newNode;
                lNode.gvalue = newNode.gvalue+1;
                lNode.hvalue = lNode.getHvalue();
//                lNode.fvalue = lNode.gvalue+lNode.hvalue;
                newNodeChild.add(lNode);
            }


        }

        if((zeroPosition/3) !=0)
        {
            Node lNode = new Node(newNode.status);
            lNode.status[zeroPosition/3][zeroPosition%3] = lNode.status[zeroPosition/3-1][zeroPosition%3];
            lNode.status[zeroPosition/3-1][zeroPosition%3] = 0;
            if(!isInList(lNode,newNode.parent))
            {
                lNode.parent = newNode;
                lNode.gvalue = newNode.gvalue+1;
                lNode.hvalue = lNode.getHvalue();
//                lNode.fvalue = lNode.gvalue+lNode.hvalue;
                newNodeChild.add(lNode);
            }
        }
    }
    private void updateNode(List<Node> newNodeChild){
        for(Node childNode:newNodeChild){
            if(isOpenIn(childNode,open));
            else if(isCloseIn(childNode,close));
            else open.add(childNode);
        }
    }

    private boolean isOpenIn(Node newNode, PriorityQueue<Node> openList)
    {
        Iterator<Node> iter = openList.iterator();
        while(iter.hasNext())
        {
            Node iterNode = iter.next();
            if(iterNode.equal(newNode.status))
            {
                if(newNode.gvalue < iterNode.gvalue)
                {
                    iterNode.parent = newNode.parent;
                    iterNode.gvalue = newNode.gvalue;
//                    iterNode.fvalue = newNode.fvalue;
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isCloseIn(Node newNode, List<Node> closeList){
        Iterator<Node> iter = closeList.iterator();
        while(iter.hasNext())
        {
            Node iterNode = iter.next();
            if(iterNode.equal(newNode.status))
            {
                if(newNode.gvalue < iterNode.gvalue)
                {
                    iterNode.parent = newNode.parent;
                    iterNode.gvalue = newNode.gvalue;
//                    iterNode.fvalue = newNode.fvalue;
                    iter.remove();
                    open.add(newNode);
                    return true;
                }
            }
        }
        return false;
    }
    public void run()
    {
        initStart();
        while(!open.isEmpty()) {
            Node newNode = open.poll();
            close.add(newNode);
            if (newNode.equal(endStatus)) {
                int i = 0;
                while (newNode != null) {
                    newNode = newNode.parent;
                    i += 1;
                }
                System.out.println(i - 1);
                break;
            }
            List<Node> newNodeChild = new ArrayList<Node>();
            initChild(newNode, newNodeChild);
            updateNode(newNodeChild);
        }
    }
}
@SuppressWarnings("unchencked")
class NodeComparator implements Comparator<Node>{
    @Override
    public int compare(Node x, Node y) {
        return x.gvalue+x.hvalue - y.gvalue-y.hvalue;
    }
}
class Node
{
    Node parent;
    public int[][] status = new int[3][3];

    int gvalue;
    int hvalue;

    public Node(int[][] status)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                this.status[i][j] = status[i][j];
            }
        }
    }
    public int getZeroPosition()
    {
        int k=0;
        for(int i=0;i<9;i++)
        {
            if(status[i/3][i%3] == 0)
            {
                k=i;
                return k;
            }
        }
        return k;
    }

    public boolean equal(int[][] endStatus)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(status[i][j]!= endStatus[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public int getHvalue()
    {
        int sum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(status[i][j]!=0)
                    sum+=Math.abs(i-(status[i][j]-1)/3)+Math.abs(j-(status[i][j]-1)%3);
            }
        }
        return sum;
    }

}