import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()) {

            String line;
            try {
                line = scan.nextLine();
            }catch(java.util.NoSuchElementException e) {
                break;
            }

            int[] hand = new int[5];

            String[] cardNum = line.split(",");

            for(int i = 0; i < 5; i++) {
                hand[i] = Integer.parseInt(cardNum[i]);
            }

            int[] number = new int[14];
            for(int i = 0; i < 5; i++) {
                number[hand[i]] += 1;
            }

            int paircount = 0;
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < 14; i++) {
                if(number[i] > 1) {
                    list.add(number[i]);
                }
                if(number[i] == 2) {
                    paircount += 1;
                }
            }

            boolean isStraight = false;
            int count = 0;
            for(int i = 0 ; i < 14 ; i++) {
            	if(number[i] == 1) {
            		count++;
            	}else if(number[i] ==0) {
            		count = 0;
            	}
            	if(i == 13 && count == 4) {
            		if(number[1] == 1) {
            			count++;
            		}
            	}
            	if(count == 5) {
            		isStraight = true;
            		break;
            	}
            }

            if(list.contains(4)) {
                System.out.println("four card");
            }else if(list.contains(3) && list.contains(2)) {
                System.out.println("full house");
            }else if(isStraight){
            	System.out.println("straight");
            } else if(list.contains(3)) {
                 System.out.println("three card");
            }else if(paircount == 2) {
                System.out.println("two pair");
            }else if(paircount == 1) {
                System.out.println("one pair");
            }else {
            	System.out.println("null");
            }

		}
	}

}

