import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            String[] st=sc.next().split(",");
            int[] card = new int[5];
            for(int i=0; i<5;i++){
            	card[i]=Integer.parseInt(st[i]);
            }
            Arrays.sort(card);
            System.out.println(judge(card));

        }
    }

    public static String judge(int[] card){
    	if(card[0]==card[3] || card[1]==card[4])return "four card";
        if((card[0]==card[1] && card[2]==card[4]) || (card[0]==card[2] && card[3]==card[4]))return "full house";
        if(card[0]+1 == card[1] && card[1]+1 == card[2] && card[2]+1 == card[3] && card[3]+1 == card[4])return "straight";
        if(card[0] == 1 && card[1] == 10 && card[2] == 11 && card[3] == 12 && card[4] == 13)return "straight";
        if(card[0]==card[2] || card[1]==card[3] || card[2]==card[4])return "three card";
        if((card[0]==card[1] && card[2]==card[3]) || (card[0]==card[1] && card[3]==card[4]) || (card[1]==card[2] && card[3]==card[4]))return "two pair";
        if(card[0]==card[1] || card[1]==card[2] || card[2]==card[3] || card[3]==card[4])return "one pair";
		return null;

    }
}