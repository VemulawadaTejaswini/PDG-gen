import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc=sc.nextInt();
        Deque<Integer> dque=new LinkedList<Integer>();
        
        
        for(int i=0;i<tc;i++){
            String str=sc.next();
            int n;
            
            if(str.equals("insert")){
                n=sc.nextInt();
                dque.addFirst(n);
            }else if(str.equals("delete")){
                n=sc.nextInt();
                dque.remove(n);
            }else if(str.equals("deleteFirst")){
                dque.pollFirst();
            }else if(str.equals("deleteLast")){
                dque.pollLast();
            }

            /*switch (str) {
                case "insert":
                    n=sc.nextInt();
                    dque.addFirst(n);
                    break;
                case "delete":
                    n=sc.nextInt();
                    dque.remove(n);
                    break;
                case "deleteFirst":
                    dque.pollFirst();
                    break;
                case "deleteLast":
                    dque.pollLast();
                    break;
                default:
                    break;
            }*/
        }
        while (!dque.isEmpty()) {
            System.out.print(dque.pollFirst());
            if(!dque.isEmpty())
                System.out.print(" ");
            else
                System.out.println();
        }
        
    }
    
}
