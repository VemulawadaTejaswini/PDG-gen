import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] suits=new char[]{'S','H','C','D'};
        Card[] cards=new Card[52];
        boolean[] flag=new boolean[52];
        Arrays.fill(flag, false);
        int cards_count=0;
        for(char c:suits){
            for(int i=1;i<=13;i++){
                cards[cards_count]=new Card(c,i);
                cards_count++;
            }
        }
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            char suit=st.nextToken().charAt(0);
            int number=Integer.parseInt(st.nextToken());
            for(int j=0;j<52;j++){
                if(cards[j].number==number&&cards[j].suit==suit){
                    flag[j]=true;
                }
            }
        }
        for(int i=0;i<52;i++){
            if(!flag[i]){
                System.out.println(cards[i].suit+" "+cards[i].number);
            }
        }
    }
    
}

class Card{
    char suit;
    int number;
    Card(char s,int n){
        this.suit=s;
        this.number=n;
    }
}