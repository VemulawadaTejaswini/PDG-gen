import java.io.*;
import java.util.*;

public class Main {
	String check( String card ) {
		int one = card.indexOf("1");
		int two = card.indexOf("2");
		if ( card.indexOf("4") != -1 )
			return "four card";
		else if ( card.indexOf("3") != -1 ) {
			if ( two != -1 )
				 return "full house";
			else
				return "three card";
		} else if ( two != card.lastIndexOf("2") )
			return "two pair";
		else if ( two != -1 )
			return "one pair";
		else {
			if ( card.charAt(0)=='1' && card.charAt(9)=='1' && card.charAt(10)=='1' && card.charAt(11)=='1' && card.charAt(12)=='1')
				return "straight";
			for ( int i = one+1; i < one+5; i++ )
				if ( card.charAt(one) != card.charAt(i) ) return "null";
			return "straight";
		}
	}
	public static void main ( String[] args ) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("[\n,]");
		Main m = new Main();
		int[] cards;
		while ( sc.hasNext() ) {
			String card = "";
			cards = new int[13];
			for ( int i = 0; i < 5; i++ )
				cards[sc.nextInt()-1]++;
			for ( int i = 0; i < cards.length; i++ )
				card += cards[i];
			String result = m.check(card);
			System.out.println(result);
		}
	}
}