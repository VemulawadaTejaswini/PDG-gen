import java.io.*;
import java.util.*;

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
    Node n;
    public DoublyLinkedList(){
        this.n=new Node(null,null,0);
        this.n.next=this.n;
        this.n.prev=this.n;
    }
    public void insert(int v){
        Node node=new Node(this.n,this.n.next,v);
        this.n.next.prev=node;
        this.n.next=node;
        if(node.next==n)
            n.prev=node;
    }
    public void delete(int v){
        Node search=n.next;
        boolean done=false;
        while(!done && search!=n){
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
        n.next.next.prev=n;
        n.next=n.next.next;
    }
    public void deleteLast(){
        n.prev.prev.next=n;
        n.prev=n.prev.prev;
    }
    public void printlist(){
        PrintWriter out = new PrintWriter(System.out);
        Node output=n.next;
        while(output.next!=n){
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
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.next());
        String[] commands={"insert","delete","deleteFirst","deleteLast"};
        String command;
        int value;
        for(int i=0;i<n;i++){
            command=scanner.next();
            if(command.equals(commands[0])){
                value=Integer.parseInt(scanner.next());
                dll.insert(value);
            }
            else if(command.equals(commands[1])){
                value=Integer.parseInt(scanner.next());
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

