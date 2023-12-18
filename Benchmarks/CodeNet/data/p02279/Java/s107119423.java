import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node nodes[] = new Node[n];
        for(int i = 0 ; i < n ; i++)
            nodes[i] = new Node(i);
        for(int i = 0 ; i < n ; i++){
            int index = sc.nextInt();
            int k = sc.nextInt();
            for(int j = 0 ; j < k ; j++)
                nodes[index].children.add(sc.nextInt());
        }
	for(int i = 0 ; i < n ; i++){
		for(int j = 0 ; j < nodes[i].children.size() ; j++)
			nodes[nodes[i].children.get(j)].parent = nodes[i];
	}
        for(int i = 0 ; i < n ; i++)
            System.out.println("node " + nodes[i].index + ": parent = " + nodes[i].get_parent() + ", depth = " + nodes[i].depth() + ", " + nodes[i].type() + ", " + nodes[i].children);
    }
}
class Node{
    int index;
    Node parent = null;
    List<Integer> children;
    int get_parent(){
        if(parent == null)
            return -1;
        else
            return parent.index;
    }
    int depth(){
        if(parent == null)
            return 0;
        else
            return parent.depth() + 1;
    }
    String type(){
        if(parent == null)
            return "root";
        else if(children.size() == 0)
            return "leaf";
        else
            return "internal node";
    }
    Node(int index){
        this.index = index;
        children = new ArrayList<Integer>();
    }
}
