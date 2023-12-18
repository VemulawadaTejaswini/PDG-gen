import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<Integer>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String op=sc.next();
            if(op.equals("insert")){
                int x=sc.nextInt();
                list.addFirst(x);
            }else if(op.equals("delete")){
            	int x=sc.nextInt();
                list.remove((Integer)x);
            }else if(op.equals("deleteFirst")){
                list.pollFirst();
            }else if(op.equals("deleteLast")){
                list.pollLast();
            }
        }
        boolean first = true;
        for(int i : list){
            System.out.print((first ? "" : " ") + i); 
            if(first){
                first = false;
            }
        }
        System.out.println();
    }
}