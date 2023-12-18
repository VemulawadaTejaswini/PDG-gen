import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Double> db = new LinkedList<Double>();
        while(sc.hasNext()){
            db.add(sc.nextDouble());
        }
        Collections.sort(db);
        System.out.println(db.get(db.size()-1)-db.get(0));
    }
}