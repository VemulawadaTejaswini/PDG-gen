import java.util.*;
public class Main {
    public static void main(String...args){
    Scanner scan = new Scanner(System.in);
    int cards = scan.nextInt();
    List<String> sCards = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13"));
    List<String> hCards = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13"));
    List<String> cCards = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13"));
    List<String> dCards = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13"));
    while(scan.hasNextLine()) {
        String[] whatCard = scan.nextLine().split(" ");
        switch(whatCard[0]) {
            case "S" : 
                sCards.remove(whatCard[1]);
                break;
            case "H" : 
                hCards.remove(whatCard[1]);
                break;
            case "C" : 
                cCards.remove(whatCard[1]);
                break;
            case "D" : 
                dCards.remove(whatCard[1]);
                break;
        }
    }
        for(String i : sCards) {
                System.out.println("S "+i);
        }
        for(String i : hCards) {
                System.out.println("H "+i);
        }
        for(String i : cCards) {
                System.out.println("C "+i);
        }
        for(String i : dCards) {
                System.out.println("D "+i);
        }
 }
 }



