import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        Deck deck = new Deck();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();//1行目は捨てる;
            br.lines().map(Card::new).forEach(deck::add);//行ごとにカード生成してデッキに追加
        }

        System.out.print(deck);
    }
}

class Deck {
    private final Map<String, Suit> suits;

    public void add(Card card) {
        suits.get(card.getSuitSymbol()).add(card.getRank());
    }

    private boolean isMissing(String suitSymbol, int rank) {
        return suits.get(suitSymbol).isMissing(rank);
    }

    private String getMissingCardListAsString() {
        List<String> missingCardList = new ArrayList<>();
        String[] suitSymbol = {"S", "H", "C", "D"};

        for(int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                if (isMissing(suitSymbol[i], j)) {
                    missingCardList.add(suitSymbol[i] + " " + j);
                }
            }
        }
        if(missingCardList.size() > 0) {
            return missingCardList.stream().collect(Collectors.joining(String.format("%n"),"", String.format("%n")));
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        return getMissingCardListAsString();
    }

    public Deck(){
        super();
        suits = new HashMap<>();
        suits.put("S", new Suit());
        suits.put("C", new Suit());
        suits.put("H", new Suit());
        suits.put("D", new Suit());
    }
}

class Suit {
    private final boolean[] cards;

    public void add(int rank) {
        cards[rank - 1] = true;
    }

    public boolean isMissing(int rank) {
        return !cards[rank - 1];
    }

    public Suit() {
        super();
        cards = new boolean[13];
    }
}

class Card {
    private final String suitSymbol;
    private final int rank;

    public String getSuitSymbol() {
        return suitSymbol;
    }

    public int getRank() {
        return rank;
    }

    private Card(String suitSymbol, int rank) {
        super();
        this.suitSymbol = suitSymbol;
        this.rank = rank;
    }

    public Card(String lineString) {
        this(lineString.split(" ")[0], lineString.split(" ")[1]);
    }

    private Card(String suitSymbol, String rank) {
        this(suitSymbol, Integer.parseInt(rank));
    }
}
