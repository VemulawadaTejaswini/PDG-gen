import java.io.PrintWriter;
import java.util.Scanner;
class Node{
    Node prev;
    Node next;
    int value;
    public Node(Node p,Node n,int v){
        prev=p;
        next=n;
        value=v;
    }
}
class DoublyLinkedList{
    Node dummy;
    public DoublyLinkedList(){
        this.dummy=new Node(null,null,0);
        this.dummy.next=this.dummy;
        this.dummy.prev=this.dummy;
    }
    public void insert(int v){
        Node node=new Node(this.dummy,this.dummy.next,v);
        this.dummy.next.prev=node;
        this.dummy.next=node;
        if(node.next==dummy)
            dummy.prev=node;
    }
    public void delete(int v){
        Node search=dummy.next;
        boolean done=false;
        while(!done && search!=dummy){
            if(search.value==v){
                search.prev.next=search.next;
                search.next.prev=search.prev;
                done=true;
            }
            else
                search=search.next;
        }
    }
    public void deleteFirst(){
        dummy.next.next.prev=dummy;
        dummy.next=dummy.next.next;
    }
    public void deleteLast(){
        dummy.prev.prev.next=dummy;
        dummy.prev=dummy.prev.prev;
    }
    public void printlist(){
        PrintWriter out = new PrintWriter(System.out);
        Node output=dummy.next;
        while(output.next!=dummy){
            out.print(output.value+" ");
            output=output.next;
        }
        out.print(output.value);
        out.println();
        out.flush();
    }
}
public class Main {
    public static void main(String[] args){
        DoublyLinkedList dll=new DoublyLinkedList();
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        String[] commands={"insert","delete","deleteFirst","deleteLast"};
        String command;
        int value;
        for(int i=0;i<n;i++){
            command=sc.next();
            if(command.equals(commands[0])){
                value=Integer.parseInt(sc.next());
                dll.insert(value);
            }
            else if(command.equals(commands[1])){
                value=Integer.parseInt(sc.next());
                dll.delete(value);
            }
            else if(command.equals(commands[2])){
                dll.deleteFirst();
            }
            else if(command.equals(commands[3])){
                dll.deleteLast();
            }
        }
        dll.printlist();
    }
}


