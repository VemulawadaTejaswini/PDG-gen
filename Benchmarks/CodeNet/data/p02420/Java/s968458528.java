import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String card = sc.next(); //最初のカードの並び
            if (card.equals("-")) break;
            int s = sc.nextInt(); //シャッフル回数
            int n = 0;//下から何枚目
            for (int i=0; i<s; i++) {
                n += sc.nextInt();
            }
            for (int i=0; i<card.length(); i++) {
                System.out.print(card.charAt((n+i)%card.length()));
            }
            System.out.println("");
        }
    }
}

