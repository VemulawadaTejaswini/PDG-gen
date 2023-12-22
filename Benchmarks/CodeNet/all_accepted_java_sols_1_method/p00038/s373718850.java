import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] lines = sc.next().split(",");
            int[] cards = new int[13];
            int max = 0;
            int max2 = 0;
            for (int i = 0; i < lines.length; i++) {
                int n = Integer.parseInt(lines[i])-1;
                cards[n]++;
                if (max < cards[n]) {
                    max = cards[n];
                } else if (max2 < cards[n]) {
                    max2 = cards[n];
                }
            }
            if (max >= 4) {
                System.out.println("four card");
            } else if (max == 3) {
                if (max2 == 2) {
                    System.out.println("full house");
                } else {
                    System.out.println("three card");
                }
            } else if (max == 2 && max2 == 2) {
                System.out.println("two pair");
            } else if (max == 2) {
                System.out.println("one pair");
            } else {
                int count=0;
                for (int i = 0; i < 14; i++) {
                    if(cards[i%13]==1) {
                        count++;
                        if(count==5) {
                            break;
                        }
                    }else {
                        count=0;
                    }
                }
                if(count==5) {
                    System.out.println("straight");
                }else {
                    System.out.println("null");
                }
            }
        }
    }
}
