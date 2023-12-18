import java.util.*;

public class Main{
    public static void main(String[] args){
	int i,j;
	Scanner scan = new Scanner(System.in);

	while(scan.hasNext()){
	    String tmp[] = (scan.nextLine()).split(",");
	    int card[] = new int[14];
	    int count[] = new int[5];
	    for(i=0;i<5;i++){
		int n = Integer.parseInt(tmp[i]) - 1;
		card[n]++;
		if(n == 0) card[13]++;
	    }
	    for(i=0;i<13;i++){
		if(card[i] < 4){
		    count[card[i]]++;
		}
		else{
		    count[4]++;
		}
	    }

	    if(count[4] == 1){
		System.out.println("four card");
	    }
	    else if(count[3] == 1){
		if(count[2] == 1){
		    System.out.println("full house");
		}
		else{
		    System.out.println("three card");
		}
	    }
	    else if(count[2] == 2){
		System.out.println("two pair");
	    }
	    else if(count[2] == 1){
		System.out.println("one pair");
	    }
	    else{
		boolean flg = false;

		for(i=0;card[i]==0;i++);
		for(j=i+1;j<14 && card[j]==1;j++);

		if(j - i == 5){
		    flg = true;
		}
		else{
		    for(i=1;card[i]==0;i++);
		    for(j=i+1;j<14 && card[j]==1;j++);

		    if(j - i == 5){
			flg = true;
		    }
		}
		if(flg){
		    System.out.println("straight");
		}
		else{
		    System.out.println("null");
		}
	    }
	}
    }
}