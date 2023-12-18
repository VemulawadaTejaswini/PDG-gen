import java.util.*;
import java.io.File;
public class Main {
    public static void main(String[] args){
        try {
            //File file = new File("./tx1.txt");
            Scanner scan = new Scanner(System.in);
            while (scan.hasNext()) {
                String s = scan.nextLine();
                //System.out.println(s);
                String[] slist = s.split("");
                StringStack2 stack = new StringStack2(100);
                boolean flg=true;
                for (String item : slist) {
                    if (item.equals("(") || item.equals("[")) {
                        stack.push(item);
                    } else if (item.equals(")")) {
                        if (stack.empty()||!(stack.pop().equals("("))) {
                            System.out.println("no");
                            flg=false;
                            break;
                        }
                    } else if (item.equals("]")) {
                        if (stack.empty()||!(stack.pop().equals("["))) {
                            System.out.println("no");
                            flg=false;
                            break;
                        }
                    }
                }
                if(!(stack.empty())){
                    System.out.println("no");
                    flg=false;
                }
                if(flg==true){
                System.out.println("yes");
                }

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class StringStack2 {
    private String[] data;
    private int size;
    private int capacity;

    public StringStack2(int capacity) {
        this.data = new String[capacity];
        this.size = 0;
    }

    public void push(String item) {
        size += 1;
        data[size] = item;
    }

    public String peek() {
        return data[size];
    }

    public String pop() {
        size -= 1;
        return data[size + 1];
    }

    public boolean empty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

}

