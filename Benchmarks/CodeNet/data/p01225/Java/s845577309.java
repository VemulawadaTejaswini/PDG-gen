import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;

class Deck{
    private LinkedHashMap<Integer, Integer> frequency = new LinkedHashMap<>();
    public Deck(){
        for (int i = 1; i <= 9; i++){
            frequency.put(i, 0);
        }
    }

    public void add(int i){
        frequency.replace(i, frequency.get(i)+1);
    }

    public int consec(){
        int sets = 0;
        for (Map.Entry<Integer, Integer> entry: frequency.entrySet()){
            if (entry.getValue() >= 3){
                sets++;
                frequency.replace(entry.getKey(), frequency.get(entry.getKey()) - 3);
            }
        }
        return sets;
    }

    public int row(){
        int sets = 0;
        Iterator<Integer> key_iter = frequency.keySet().iterator();
        Iterator<Integer> iter = frequency.values().iterator();
        int first_key = key_iter.next(), mid_key = key_iter.next();
        int first = iter.next(), mid = iter.next();
        while(iter.hasNext()){
            int last = iter.next(), last_key = key_iter.next();
            while (last >= 1 && mid >= 1 && first >= 1){
                sets++;
                last--; mid--; first--;
            }
            frequency.replace(last_key, last);
            frequency.replace(mid_key, mid);
            frequency.replace(first_key, first);
            first_key = mid_key; mid_key = last_key;
            first = mid; mid = last;
        }
        return sets;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            LinkedHashMap<Character, Deck> colorDeck = new LinkedHashMap<>();
            colorDeck.put('R', new Deck()); colorDeck.put('G', new Deck()); colorDeck.put('B', new Deck());
            int number_list[] = new int[9];
            for (int j = 0; j < 9; j++) number_list[j] = sc.nextInt();
            for (int j = 0; j < 9; j++) colorDeck.get(sc.next().charAt(0)).add(number_list[j]);
            int sets = 0;
            for (Deck deck: colorDeck.values()){
                sets += deck.consec();
                sets += deck.row();
            }
            System.out.println(((sets >= 3)? 1:0));
        }
    }
}