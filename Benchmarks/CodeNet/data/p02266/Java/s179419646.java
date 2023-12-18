
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static class LinkElement {
        LinkElement prev;
        LinkElement next;
        Object value;
        
        public LinkElement(Object value) {
            this.value = value;
        }

        public void insertAfter(LinkElement newElement) {
            newElement.prev = this;
            newElement.next = this.next;
            this.next.prev = newElement;
            this.next = newElement;
        }

        public void delete() {
            if (prev != null) {
                prev.next = next;
            }
            if (next != null) {
                next.prev = prev;
            }
        }
    }

    static class DoubleLinkedList {
        LinkElement first;
        LinkElement last;

        public DoubleLinkedList() {
            first = new LinkElement(null);
            last = new LinkElement(null);
            first.next = last;
            last.prev = first;
        }

        public void insert(Object x) {
            first.insertAfter(new LinkElement(x));
        }
        
        public void delete(Object x) {
            LinkElement it = first.next;
            while (it != last) {
                if (it.value.equals(x)) {
                    it.delete();
                    break;
                }
                it = it.next;
            }
        }
        
        public void deleteFirst() {
            if (first.next != last) {
                first.next.delete();
            }
        }
        
        public void deleteLast() {
            if (first.next != last) {
                last.prev.delete();
            }
        }
        
        public String toString() {
            StringBuilder builder = new StringBuilder();
            LinkElement it = first.next;
            while (it != last) {
                if (builder.length() > 0) {
                    builder.append(" ");
                }
                builder.append(it.value);
                it = it.next;
            }
            return builder.toString();
        }
    }

    public static class Shape {
        final int leftHeight;
        final int rightHeight;
        final char type;
        
        public Shape(int leftHeight, char type) {
            this.leftHeight = leftHeight;
            switch(type) {
            case '\\':
                this.rightHeight = leftHeight - 1;
                break;
            case '/':
                this.rightHeight = leftHeight + 1;
                break;
            case '_':
                this.rightHeight = leftHeight;
                break;
            default:
                this.rightHeight = -99999;
                break;
            }
            this.type = type;
        }
        
        public int bottomHeight() {
            switch(type) {
            case '\\':
                return rightHeight;
            case '/':
                return leftHeight;
            case '_':
                return leftHeight;
            default:
                return -99999;
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String area = r.readLine();
        Shape[] heights = new Shape[area.length()];
        int[] waterAreas = new int[heights.length];
        
        int height = 0;
        int maxHeight = 0;
        for (int i = 0;i < area.length();i++) {
            heights[i] = new Shape(height, area.charAt(i));
            maxHeight = Math.max(maxHeight, height);
            height = heights[i].rightHeight;
        }

        int foundIndex = 0;
        int totalAreaSize = 0;
        
        Shape left, right;
        for (int i = 0;i < heights.length;i++) {
            left = heights[i];
            if (left.type != '\\') {
                continue;
            }
            int angleCount = 0;
            int regularCount = 0;
            for (int k = i + 1;k < heights.length;k++) {
                right = heights[k];
                if (right.type == '/' && right.rightHeight == left.leftHeight) {
                    angleCount++;
                    int areaSize = angleCount + regularCount;
                    waterAreas[foundIndex++] = areaSize;
                    totalAreaSize += areaSize;
                    i = k;
                    break;
                } else if (right.type == '/') {
                    angleCount++;
                    regularCount += left.leftHeight - right.rightHeight;
                } else if (right.type == '_') {
                    regularCount += left.leftHeight - right.leftHeight;
                } else if (right.type == '\\') {
                    regularCount += left.leftHeight - right.leftHeight;
                }
            }
        }
        
        System.out.println(totalAreaSize);
        StringBuilder builder = new StringBuilder();
        for (int i = 0;i < foundIndex;i++) {
            if (i != 0) {
                builder.append(" ");
            }
            builder.append(waterAreas[i]);
        }
        System.out.println(("" + foundIndex + " " + builder).trim());
    }
}