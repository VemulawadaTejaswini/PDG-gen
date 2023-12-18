import java.io.*;

/**
 * C3
 */
public class Main {

    public static void main(String[] args) throws IOException {
        DualList arr = new DualList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int len = Integer.parseInt(line);
        for(int i=0; i<len; i++){
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "insert":
                    arr.insert(Integer.parseInt(command[1]));
                    break;
                case "delete":
                    arr.delete(Integer.parseInt(command[1]));
                    break;
                case "deleteFirst":
                    arr.deleteFirst();
                    break;
                case "deleteLast":
                    arr.deleteLast();
                    break;
            }
        }
        System.out.println(arr.dump());
    }
}

class InnerList{
    public InnerList prev = null;
    public InnerList next = null;
    public int self;
    public InnerList(int num){
        this.self = num;
    }
}

class DualList{
    public InnerList first = new InnerList(-1);
    public InnerList last = new InnerList(-1);

    public DualList(){
        this.first.next = this.last;
        this.last.prev = this.first;
    }

    public void insert(int x){
        InnerList inner = new InnerList(x);
        inner.prev = this.first;
        inner.next = this.first.next;
        this.first.next.prev = inner;
        this.first.next = inner;
    }

    public void delete(int x){
        InnerList current = this.first;
        while(true){
            current = current.next;
            if(current.next == null) break;
            if(current.self==x){
                del(current);
                break;
            }
        }
    }

    public void deleteFirst(){
        del(this.first.next);
    }

    public void deleteLast(){
        del(this.last.prev);
    }

    public String dump(){
        StringBuffer val = new StringBuffer();
        InnerList current = this.first.next;
        while(true){
            if(current.next == null) break;
            val.append(current.self);
            val.append(" ");
            current = current.next;
        }
        return val.toString().trim();
    }

    private void del(InnerList x){
        x.prev.next = x.next;
        x.next.prev = x.prev;
    }
}
