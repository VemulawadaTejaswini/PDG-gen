import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean cards[][];
        cards=new boolean[4][13];
        for(int i=0;i<4;i++) {
            for (int j = 0; j < 13; j++) {
                cards[i][j]=false;
            }
        }

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int tmp;
            String str=sc.next();
            int rank=sc.nextInt();
            if(str.equals("S"))tmp=0;
            else if(str.equals("H"))tmp=1;
            else if(str.equals("C"))tmp=2;
            else if(str.equals("D"))tmp=3;
            else break;
            if(rank<1&&13<rank)break;
            rank--;
            cards[tmp][rank]=true;
        }
        for(int i=0;i<4;i++) {
            for (int j = 0; j < 13; j++) {
                if(!cards[i][j]){
                    if(i==0)System.out.print("S ");
                    if(i==1)System.out.print("H ");
                    if(i==2)System.out.print("C ");
                    if(i==3)System.out.print("D ");
                    System.out.println(j+1);
                }
            }
        }
    }
}

