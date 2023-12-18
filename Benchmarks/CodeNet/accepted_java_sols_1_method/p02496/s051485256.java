import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean card[][] = new Boolean[4][13];
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 13 ; j++){
                card[i][j] = false;
            }
        }


        for(int i = 0 ; i < n ; i++){
            char c;
            int suit,num;
            c = sc.next().charAt(0);
            num = sc.nextInt();
            suit = 0;

            if(c == 'S')suit = 0;
            else if(c == 'H')suit = 1;
            else if(c == 'C')suit = 2;
            else if(c == 'D')suit = 3;
            card[suit][num-1] = true;
        }

        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 13 ; j++){
                if(!card[i][j]){
                    if(i == 0)System.out.print("S ");
                    else if(i == 1)System.out.print("H ");
                    else if(i == 2)System.out.print("C ");
                    else if(i == 3)System.out.print("D ");
                    System.out.println(j+1);
                }
            }
        }
    }
}