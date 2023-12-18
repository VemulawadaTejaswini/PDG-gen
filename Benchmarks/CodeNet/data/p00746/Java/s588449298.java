import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while(true){
            int n=scan.nextInt();
            if(n==0){
                break;
            }
            int[] maxMin=new int[4];
            List<NodeM1165> list=new LinkedList<NodeM1165>();
            NodeM1165 node=new NodeM1165();
            for(int i=0;i<4;i++){
                maxMin[i]=0;
            }
            node.setX(0);
            node.setY(0);
            list.add(node);
            for(int i=1;i<n;i++){
                int index=scan.nextInt();
                int move=scan.nextInt();
                list.add(getXY(list,index,move));
            }
            for(int i=1;i<list.size();i++){
                node=list.get(i);
                int x=node.getX();
                int y=node.getY();
                if(x>0){
                    if(maxMin[0]<x){
                        maxMin[0]=x;
                    }
                }
                else {
                    if(maxMin[1]>x){
                        maxMin[1]=x;
                    }
                }
                if(y>0){
                    if(maxMin[2]<y){
                        maxMin[2]=y;
                    }
                }
                else {
                    if(maxMin[3]>y){
                        maxMin[3]=y;
                    }
                }
            }
            int hoge=maxMin[0]-maxMin[1]+1;
            int huga=maxMin[2]-maxMin[3]+1;
            System.out.println(hoge+" "+huga);
        }
    }
    private static NodeM1165 getXY(List<NodeM1165> list,int index,int move){
        NodeM1165 node=list.get(index);
        int x=node.getX();
        int y=node.getY();
        if(move==0){
            x--;
        }
        else if(move==1){
            y--;
        }
        else  if(move==2){
            x++;
        }
        else {
            y++;
        }
        node=new NodeM1165();
        node.setY(y);
        node.setX(x);
        return  node;
    }
}
class NodeM1165{
    private int x,y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
