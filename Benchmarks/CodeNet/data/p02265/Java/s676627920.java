
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    static class Item {
        Object value;
        public Item(Object value) {
            this.value = value;
        }
    }

    static class LinkElement {
        LinkElement prev;
        LinkElement next;
        Object value;
        
        public LinkElement(Object value) {
            this.value = value;
        }
    }

    static class DoubleLinkedList {
        LinkElement first;
        LinkElement last;

        public DoubleLinkedList() {
            first = null;
            last = null;
        }

        public void insert(Object x) {
            LinkElement newElement = new LinkElement(x);
            newElement.next = first;
            if (first != null) {
                first.prev = newElement;
            }
            first = newElement;
            if (last == null) {
                last = newElement;
            }
        }
        
        public void delete(Object x) {
            LinkElement it = first;
            while (it != null) {
                if (it.value.equals(x)) {
                    if (last == it) {
                        deleteLast();
                    } else {
                        if (it.next != null) {
                            it.next.prev = it.prev;
                        }
                        if (it.prev != null) {
                            it.prev.next = it.next;
                        }
                    }
                    break;
                }
                it = it.next;
            }
        }
        
        public void deleteFirst() {
            if (first == null) {
                return;
            }

            if (first.next != null) {
                first.next.prev = null;
            }
            first = first.next;
        }
        
        public void deleteLast() {
            if (last == null) {
                return;
            }

            if (last.prev != null) {
                last.prev.next = null;
            }
            last = last.prev;
        }
        
        public String toString() {
            StringBuilder builder = new StringBuilder();
            LinkElement it = first;
            while (it != null) {
                if (builder.length() > 0) {
                    builder.append(" ");
                }
                builder.append(it.value);
                it = it.next;
            }
            return builder.toString();
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        DoubleLinkedList list = new DoubleLinkedList();
        
        for (int i = 0;i < n;i++) {
            String[] elems = r.readLine().split(" ");
            String cmd = elems[0];
            if (cmd.equals("insert")) {
                list.insert(Integer.parseInt(elems[1]));
            } else if (cmd.equals("delete")) {
                list.delete(Integer.parseInt(elems[1]));
            } else if (cmd.equals("deleteFirst")) {
                list.deleteFirst();
            } else if (cmd.equals("deleteLast")) {
                list.deleteLast();
            } else {
                //
                break;
            }
        }
        
        System.out.println(list.toString());
    }
}