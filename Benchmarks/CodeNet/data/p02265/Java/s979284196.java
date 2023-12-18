import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int index = 0;
        int count = 0;
        DoublyLinkedList linkedList = new DoublyLinkedList();
        while (sc.hasNextLine()){
            if(n == 0){
                n = Integer.valueOf(sc.nextLine().trim());
                if(n <= 0 || n > 2000000){
                    throw new IndexOutOfBoundsException();
                }
            }else{
                int key = 0;
                String[] temp = sc.nextLine().trim().split(" ");
                String command = temp[0].trim();
                if(temp.length == 2){
                    key = Integer.valueOf(temp[1].trim());
                }

                call(linkedList,command,key);
                index ++;
                if(index == n){
                    break;
                }
            }
        }

        trace(linkedList);
    }



    static void call(DoublyLinkedList linkedList,String command,int key){
        if(key < 0 || key > 1000000000){
            throw new IndexOutOfBoundsException();
        }
        if("insert".equals(command)){
            linkedList.insert(key);
        }
        else if("delete".equals(command)){
            linkedList.delete(key);

        }
        else if("deleteFirst".equals(command)){
            linkedList.deleteFirst();
        }
        else if("deleteLast".equals(command)){
            linkedList.deleteLast();
        }
    }

  static class DoublyLinkedList{
        Node head;

        DoublyLinkedList(){
            init();
        }


        void init(){
            head = new Node();
            head.next = head;
            head.prev = head;
        }


        void insert(int key){
            Node cur = new Node();
            cur.key = key;
            //往头结点后添加元素
            cur.next = head.next;
            head.next.prev = cur;
            cur.prev = head;
            head.next = cur;
        }

        Node listSearch(int key){
            //从头结点后 第一个元素开始搜索
            Node cur = head.next;
            while (cur != head && cur.key != key){
                cur = cur.next;
            }
            return cur;
        }




        void deleteNode(Node cur){
            if(cur == head){
                return ;
            }
            cur.prev.next = cur.next;
            cur.next.prev = cur.prev;
        }

        void delete(int key){
            Node cur = listSearch(key);
            deleteNode(cur);
        }


        void deleteFirst(){
            deleteNode(head.next);
        }

        void deleteLast(){
            deleteNode(head.prev);
        }

        class Node {

            int key;
            Node prev;
            Node next;
        }
    }


    static void trace(DoublyLinkedList linkedList){
      StringBuilder sb = new StringBuilder();

        DoublyLinkedList.Node cur = linkedList.head.next;
      while (cur != linkedList.head){
          sb.append(cur.key).append(" ");
          cur = cur.next;
      }

        System.out.println(sb.toString().trim());
    }
}

