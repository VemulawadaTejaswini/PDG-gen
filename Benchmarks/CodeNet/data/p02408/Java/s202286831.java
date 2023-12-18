import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_6_B
 * 
 * @author eitatsuro
 * 
 */
public class Main {
    private final static String SPACE = " ";
    
    public static void main(String[] args) {
        try {
            LineNumberReader stdReader = new LineNumberReader(
                    new InputStreamReader(System.in));
            
            String sStr;
            int n = 0;
            ArrayList<Card> cards = new ArrayList<Card>();
            while ((sStr = stdReader.readLine()) != null) {
                
                // ????????????????????????
                if (stdReader.getLineNumber() == 1) {
                    String[] inputs = sStr.split(" ");
                    n = Integer.valueOf(inputs[0]);
                }
                
                // 2????????\??????????????????
                if (stdReader.getLineNumber() > 1) {
                    String[] inputs = sStr.split(SPACE);
                    String egara = inputs[0];
                    int rank = Integer.parseInt(inputs[1]);
                    cards.add(new Card(egara, rank));
                    
                    if (stdReader.getLineNumber() > n)
                        break;
                }
            }
            
            // 52????????????????????????.
            ArrayList<Card> allCards = new ArrayList<Card>();
            String[] a = { "S", "H", "C", "D" };
            for (String b : a) {
                for (int i = 1; i <= 13; i++) {
                    allCards.add(new Card(b, i));
                }
            }
            
            // ??¨?????????????????????????????????????????????????????????
            ArrayList<Card> missingCards = new ArrayList<Card>(allCards);
            for (Card c : cards) {
                missingCards.remove(c);
            }
            
            for (Card s : missingCards) {
                System.out.print(s.getEgara() + SPACE);
                System.out.println(s.getRank());
            }
            System.out.println();
            
            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
        
    }
    
    public static class Card {
        @Override
        public String toString() {
            return "Card [m_egara=" + m_egara + ", m_rank=" + m_rank + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result
                    + ((m_egara == null) ? 0 : m_egara.hashCode());
            result = prime * result + m_rank;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Card other = (Card) obj;
            if (m_egara == null) {
                if (other.m_egara != null)
                    return false;
            } else if (!m_egara.equals(other.m_egara))
                return false;
            if (m_rank != other.m_rank)
                return false;
            return true;
        }

        private String m_egara = "";
        private int    m_rank  = 0;
        
        public Card(String egara, int rank) {
            m_egara = egara;
            m_rank = rank;
        }
        
        public String getEgara() {
            return m_egara;
        }
        
        public void setEgara(String m_egara) {
            this.m_egara = m_egara;
        }
        
        public int getRank() {
            return m_rank;
        }
        
        public void setRank(int m_rank) {
            this.m_rank = m_rank;
        }
        
    }
}