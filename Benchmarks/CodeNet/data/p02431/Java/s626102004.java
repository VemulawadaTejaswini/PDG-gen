import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> vec = new Vector<>();
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++){
            char c = sc.nextLine();
            switch(c){
            case '0' : vec.add(Character.getNumericValue(sc.next().charAt(0))); break;
            case '1' : System.out.println(vec.elementAt(Character.getNumericValue(sc.next().charAt(0)))); break;
            case '2' : vec.remove(vec.size()-1); break;
            }
        }
    }
}
