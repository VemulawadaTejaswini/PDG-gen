import java.util.*;

class Main{
    public static final int MAX_NUM = 1000000;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        sc.nextLine();

        LinkedList<Integer> List = new LinkedList<Integer>();
        ListIterator<Integer> it = List.listIterator();

        for(int i=0;i<q;i++){
            int order = sc.nextInt();
            switch(order){
                case 0:
                    int x = sc.nextInt();
                    it.add(x);
                    it.previous();
                    break;
                case 1:
                    int d = sc.nextInt();
                    if(d > 0){
                        for(int j=0;j<d;j++)it.next();
                    }else{
                        for(int j=0;j<-d;j++)it.previous();
                    }
                    break;
                case 2:
                    it.next();
                    it.remove();
                    break;
            }
        }
        for(Integer i:List) System.out.println(i);
    }
}
