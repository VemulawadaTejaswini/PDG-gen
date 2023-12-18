import java.util.*;

class Main{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            list.add(String.format("%d",Math.abs(sc.nextInt() + sc.nextInt())).length());
        }
        for(int i = 0,size = list.size();i < size;i++){
            System.out.println(list.get(i));
        }
    }
}