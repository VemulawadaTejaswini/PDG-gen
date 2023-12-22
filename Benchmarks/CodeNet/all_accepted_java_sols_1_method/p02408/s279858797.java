import java.util.Scanner;
 
class Main{
  public static void main(String[] arg){
    int n;
    int [][] card = new int[4][13];

    for(int i=0; i<4; i++)
        for(int j=0; j<13; j++)
            card[i][j] = 0;

    Scanner in = new Scanner(System.in);

    n = in.nextInt();

    String mark;
    int su;

    for(int i=0; i<n; i++){
        in.nextLine();
        mark = in.next();
        su = in.nextInt();

        if(mark.equals("S"))
            card[0][su-1] = 1;
        else if(mark.equals("H"))
            card[1][su-1] = 1;
        else if(mark.equals("C"))
            card[2][su-1] = 1;
        else
            card[3][su-1] = 1;
    }

    for(int i=0; i<4; i++)
        for(int j=0; j<13; j++)
            if(card[i][j] == 0){
                if(i == 0)
                    System.out.println("S " + (j+1));
                else if(i == 1)
                    System.out.println("H " + (j+1));
                else if(i == 2)
                    System.out.println("C " + (j+1));
                else
                    System.out.println("D " + (j+1));
            }
  }
}