import java.lang.StringBuilder;
import java.util.Scanner;

public class Main {
    private static class Data {
        private int key;
        private Data next;
        private Data prev;
    
        public Data(int key) {
            this.key = key;
            this.next = null;
            this.prev = null;
        }
        
        public void setNext(Data data) {
            this.next = data;
        }
        
        public void setPrev(Data data) {
            this.prev = data;
        }
    
        public boolean unmatch(int key) {
            if(this.key != key) {
                return true;
            }
            return false;
        }
        
        public int getKey() {
            return this.key;
        }
    
        public Data getNext() {
            return this.next;
        }
    
        public Data getPrev() {
            return this.prev;
        }
    }

    private static class DoublyLinkedList {
        private Data dummy;
        private Data last;
        
        public DoublyLinkedList() {
            this.dummy = new Data(-1);
            this.dummy.setNext(this.dummy);
            this.dummy.setPrev(this.dummy);
            this.last = this.dummy;
        }
        
        public void print() {
            Data data = this.dummy.getNext();
            StringBuilder sb = new StringBuilder();
            sb.append(data.key);

            data = data.getNext();
            while(data.getKey() != this.dummy.getKey()) {
                sb.append(" " + data.key);
                data = data.getNext();
            }
            System.out.println(sb.toString());
        }
        
        public void insert(int key) {
            Data data = new Data(key);
            data.setNext(this.dummy.getNext());
            data.getNext().setPrev(data);
            this.dummy.setNext(data);
        }
        
        public void delete(int key) {
            Data data = this.dummy.getNext();
            while(data.getKey() != this.dummy.getKey()) {
                if(data.unmatch(key)) {
                    data = data.getNext();
                    continue;
                }
                
                Data prev = data.getPrev();
                Data next = data.getNext();
                prev.setNext(next);
                next.setPrev(prev);
                data = data.getNext();
                break;
            }
        }
        
        public void deleteFirst() {
            Data newFirst = this.dummy.getNext().getNext();
            this.dummy.setNext(newFirst);
            newFirst.setPrev(this.dummy);
        }

        public void deleteLast() {
            Data newLast = this.last.getPrev().getPrev();
            this.last.setPrev(newLast);
            newLast.setNext(this.last);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DoublyLinkedList list = new DoublyLinkedList();
        
        for(int i = 0; i < n; i++) {
            String command = sc.next();

            if(command.equals("insert")) {
                int x = sc.nextInt();
                list.insert(x);

            } else if(command.equals("delete")) {
                int x = sc.nextInt();
                list.delete(x);

            } else if(command.equals("deleteFirst")) {
                list.deleteFirst();

            } else if(command.equals("deleteLast")) {
                list.deleteLast();
            }
        }
        
        list.print();
    }
}