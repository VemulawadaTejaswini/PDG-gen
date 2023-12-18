import java.util.*;

public class Main{
    static int[] cards;
    static int[] hindo;
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String[] line = sc.next().split(",");
	    cards = new int[5];
	    hindo = new int[14];
	    for(int i=0; i<cards.length; i++){
		cards[i] = Integer.parseInt(line[i]);
		hindo[cards[i]]++;
	    }

	    String ans = solve();

	    System.out.println(ans);

	}
    }

    public static String solve(){
	int four = 0;
	int three = 0;
	int two = 0;
	int firstOne = 0;
	for(int i=0; i<hindo.length; i++){
	    if(hindo[i]==1 && firstOne==0){firstOne=i;}
	    if(hindo[i]==4){four++;}
	    if(hindo[i]==3){three++;}
	    if(hindo[i]==2){two++;}
	}
	if(four==1){return "four card";}
	if(three==1 && two==1){return "full house";}
	if(three==1){return "three card";}
	if(two==2){return "two pair";}
	if(two==1){return "one pair";}
	if(firstOne>hindo.length-4){return "null";}

	boolean straight1 = true;
	for(int i=firstOne; i<=firstOne+4; i++){
	    if(i==14){i=1;}
	    if(hindo[i]!=1){straight1 = false;}
	}
	boolean straight2 = true;
	int count = 0;
	for(int i=firstOne; ; i--){
	    if(count==5){break;}
	    if(i==0){i=13;}
	    if(hindo[i]!=1){straight2 = false;}
	    count++;
	}
	if(straight1 || straight2){return "straight";}

	else return "null";
    }
}