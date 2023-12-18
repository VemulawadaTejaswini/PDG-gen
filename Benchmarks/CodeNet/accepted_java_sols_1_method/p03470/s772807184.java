import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();
        int N = sc.nextInt();
        while(sc.hasNext()){
            set.add(sc.nextInt());
        }
        System.out.println(set.size());
    }
}