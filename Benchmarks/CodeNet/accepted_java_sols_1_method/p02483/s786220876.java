import java.util.*;

class Main{
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(s.nextInt());
        list.add(s.nextInt());
        list.add(s.nextInt());
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            if(i != 0)System.out.print(" ");
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}