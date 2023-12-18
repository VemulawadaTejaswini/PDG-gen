import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> train = new LinkedList<>();
        while(sc.hasNext()){
            String str = sc.next();
            switch(str){
                case "0":
                    System.out.println(train.getLast());
                    train.removeLast();
                    break;
                default:
                    train.add(str);
                    break;
            }
        }
    }
}