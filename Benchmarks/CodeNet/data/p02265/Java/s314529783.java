import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in, "MS932");
        int n = input.nextInt();
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        while (n-- > 0) {
            String s = input.next();
            if ("insert".equals(s)) {
                int x = input.nextInt();
                list.insert(x);
            } else if ("delete".equals(s)) {
                int x = input.nextInt();
                list.delete(x);
            } else if ("deleteFirst".equals(s)) {
                list.deleteFirst();
            } else if ("deleteLast".equals(s)) {
                list.deleteLast();
            }
        }
        print(list.toArray());
    }
    
    private void print(Object[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs) sb.append(x.toString()).append(' ');
        System.out.println(sb.toString().trim());
    }
    
    private static class DoublyLinkedList<T> {
        Object[] list = new Object[0];
        int size = 0;
        
        public void insert(T x) {
            size += 1;
            Object[] newList;
            if (list.length < size) {
                newList = new Object[size*2];
            } else {
                newList = list;
            }
            for (int i = size - 1; 0 < i; i--) {
                newList[i] = list[i-1];
            }
            newList[0] = x;
            list = newList;
        }
        public void delete(T x) {
            if (size <= 0) return;
            int index;
            for (index = 0; index < size; index++) {
                if (list[index].equals(x)) {
                    break;
                }
            }
            if (index >= size) return;
            for (int i = index; i < size - 1; i++) {
                list[i] = list[i+1];
            }
            size -= 1;
        }
        public void deleteFirst() {
            if (size <= 0) return;
            for (int i = 0; i < size - 1; i++) {
                list[i] = list[i+1];
            }
            size -= 1;
        }
        public void deleteLast() {
            if (size <= 0) return;
            size -= 1;
        }
        public Object[] toArray() {
            return Arrays.copyOf(list, size);
        }
    }
}