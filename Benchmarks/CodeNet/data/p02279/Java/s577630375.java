import java.util.*;
import java.io.*;

public class Main{
    static class Node{
        int nodeNumber;
        Node parent;
        Node right;
        Node leftChild;
        ArrayList<Integer> childList=new ArrayList<Integer>();

        int getDepth(){
            int depth=0;
            Node that=this.parent;
            while(that!=null){
                depth++;
                that=that.parent;
            }
            return depth;
        }
    }
    public static void main (String args[]){

        //初期処理
        // Scanner sc=new Scanner(System.in);
        // int n=Integer.parseInt(sc.nextLine());
        // String[] sElementArray=sc.nextLine().split(" ");
        // int[] array=Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();
        // sc.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       try{
            int n= Integer.parseInt(br.readLine());

            //Node管理用の配列
            Node[] allNode=new Node[n];
            for(int s=0;s<n;s++){
                allNode[s]=new Node();
            }

            for(int i=0;i<n;i++){
                String[] sElementArray = br.readLine().split(" ");
                int[] array = Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();

                //番号設定
                allNode[array[0]].nodeNumber=array[0];
                
                //そのほか4つのプロパティを設定
                if(array[1]!=0){
                    for(int k=2;k<=array[1]+2-1;k++){  //kは行内の要素番号。array=[0,3,1,4,10]の子ノードをとる。
                        allNode[array[k]].parent=allNode[array[0]];   //子の親を自分に設定 
                        allNode[array[0]].childList.add(array[k]);
                        if(k==2){
                            allNode[array[0]].leftChild=allNode[k];  //左の子を最初の子要素に設定
                        } 
                        if(k!=array[1]+2-1){
                            allNode[k].right=allNode[array[k+1]];  //子の右要素を設定
                        }
                    }
                }
            }
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<n;i++){
                Node node=allNode[i];
                //node number
                sb.append("node "+node.nodeNumber+": ");

                //親
                sb.append("parent = ");
                if(node.parent!=null){
                    sb.append(node.parent.nodeNumber);
                }else {
                    sb.append("-1");
                }
                sb.append(", ");

                //深さ
                sb.append("depth = "+node.getDepth()+", ");
                
                //Nodeの種類
                if(node.parent==null){
                    sb.append("root,");
                }else if(node.childList.size()==0){
                    sb.append("leaf,");
                }else {
                    sb.append("internal node,");
                }
                //子
                sb.append(" [");
                    node.childList.forEach(x->sb.append(x+", "));;
                    if(node.childList.size()!=0){
                        sb.setLength(sb.length()-2);
                    }

                sb.append("]\n");

            }
            System.out.print(sb);
        }catch(IOException e){e.printStackTrace();}
        }
    }
    
