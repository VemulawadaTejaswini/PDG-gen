import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        LinkedList<Integer> linkedList=new LinkedList();
    }
    
    private enum Command{
        Insert("insert"),
        Delete("delete"),
        DeleteFirst("deleteFirst"),
        DeleteLast("deleteLast");
        public final String name;
        private Command(String name){
            this.name=name;
        }
        public static Command recognize(String name){
            if(name.equals(Insert.name)){
                return Insert;
            }else if(name.equals(Delete.name)){
                return Delete;
            }else if(name.equals(DeleteFirst.name)){
                return DeleteFirst;
            }else{
                return DeleteLast;
            }
        }
    }
}

