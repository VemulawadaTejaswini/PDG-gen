import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static class Data {
        public int key;
        public Data next;
        public Data prev;
     
        public Data(int key) {
            this.key = key;
            this.next = null;
            this.prev = null;
        }
    }
 
    private static class DoublyLinkedList {
        private Data dummy;
        private Data last;
         
        public DoublyLinkedList() {
            this.dummy = new Data(-1);
            this.dummy.next = this.dummy;
            this.dummy.prev = this.dummy;
            this.last = this.dummy;
        }
         
        public void print() {
            Data data = this.dummy.next;
            StringBuilder sb = new StringBuilder();
            sb.append(data.key);
 
            data = data.next;
            while(data.key!= this.dummy.key) {
                sb.append(" ");
                sb.append(data.key);
                data = data.next;
            }
            System.out.println(sb.toString());
        }
         
        public void insert(int key) {
            Data data = new Data(key);
            data.next = this.dummy.next;
            data.prev = this.dummy;
            data.next.prev = data;
            this.dummy.next = data;
        }
         
        public void delete(int key) {
            for(Data data = this.dummy.next; data.key != this.dummy.key; data = data.next) {
                if(data.key == key) {
                    data.prev.next = data.next;
                    data.next.prev = data.prev;
                    break;
                }
            }
        }
         
        public void deleteFirst() {
            Data newFirst = this.dummy.next.next;
            this.dummy.next = newFirst;
            newFirst.prev = this.dummy;
        }
 
        public void deleteLast() {
            Data newLast = this.last.prev.prev;
            this.last.prev = newLast;
            newLast.next = this.last;
        }
    }
 
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        DoublyLinkedList list = new DoublyLinkedList();
         
        for(int i = 0; i < n; i++) {
            String[] commands = br.readLine().split(" ");
 
            if(commands[0].equals("insert")) {
                int x = Integer.parseInt(commands[1]);
                list.insert(x);
 
            } else if(commands[0].equals("delete")) {
                int x = Integer.parseInt(commands[1]);
                list.delete(x);
 
            } else if(commands[0].equals("deleteFirst")) {
                list.deleteFirst();
 
            } else if(commands[0].equals("deleteLast")) {
                list.deleteLast();
            }
        }
         
        list.print();
    }
}