import java.util.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String[] str = (sc.next()).split(",");
	    int[] hand = new int[5];
	    for(int i = 0; i < 5; i++)
		hand[i] = Integer.parseInt(str[i]);
	    Arrays.sort(hand);
	    String res;

	    if(straight(hand)) res = "straight";
	    else res = func(hand);

	    System.out.println(res);
	}
    }

    String func(int[] hand){
	int[] num = new int[14];
	for(int i = 0; i < 5; i++) num[hand[i]]++;
	Arrays.sort(num);
	
	if(num[13] == 4) return "four card";
	if(num[13] == 3)
	    return (num[12] == 2)? "full house" : "three card";
	if(num[13] == 2)
	    return (num[12] == 2)? "two pair" : "one pair";

	return "null";
    }

    boolean straight(int[] hand){
	boolean f;
	if(hand[0] == 1){
	    f = true;
	    for(int i = 1; i < 5 && f; i++)
		f = (hand[i] == 9+i);

	    if(f) return f;
	}
	f = true;
	for(int i = 1; i < 5 && f; i++)
	    f = (hand[i] == (hand[0]+i));

	return f;
    }

    public static void main(String[] args){
	new Main();
    }
}