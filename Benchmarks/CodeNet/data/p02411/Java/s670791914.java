import java.util.Scanner;
 
class Main{
  public static void main(String[] arg){
    int m, f, r;

    Scanner in = new Scanner(System.in);

    while(true){
        m = in.nextInt();
        f = in.nextInt();
        r = in.nextInt();
        
        if(m == -1 && f == -1 && r == -1) break;

        char check;
        if(m == -1 || f == -1) check = 'F';
        else if((m+f)>=80) check = 'A';
        else if((m+f)>=65) check = 'B';
        else if((m+f)>=50) check = 'C';
        else if((m+f)>=30){
            if(r>=50) check = 'C';
            else check = 'D';

        }
        else check = 'F';

        System.out.println(check);
    }

  }
}