import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        long memStrt = Runtime.getRuntime().totalMemory()
            - Runtime.getRuntime().freeMemory();
        
        Main main = new Main();
        main.solv();
        
        long memEnd = Runtime.getRuntime().totalMemory()
            - Runtime.getRuntime().freeMemory();
        long memDif = memEnd - memStrt;
        //System.out.println(memDif);
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in, "MS932");
        int n = input.nextInt();
        DoublyLinkedList list = new DoublyLinkedList();
        while (n-- > 0) {
            String s = input.next();
            if ("insert".equals(s)) {
                long x = input.nextLong();
                list.insert(x);
            } else if ("delete".equals(s)) {
                long x = input.nextLong();
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
    
    private void print(long[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs) sb.append(x).append(' ');
        System.out.println(sb.toString().trim());
    }
    
    private static class DoublyLinkedList {
        long[] list = new long[0];
        int size = 0;
        
        public void insert(long x) {
            size += 1;
            long[] newList;
            if (list.length < size) {
                newList = new long[size*2];
            } else {
                newList = list;
            }
            for (int i = size - 1; 0 < i; i--) {
                newList[i] = list[i-1];
            }
            newList[0] = x;
            list = newList;
        }
        public void delete(long x) {
            if (size <= 0) return;
            int index;
            for (index = 0; index < size; index++) {
                if (list[index] == x) {
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
        public long[] toArray() {
            return Arrays.copyOf(list, size);
        }
    }
}