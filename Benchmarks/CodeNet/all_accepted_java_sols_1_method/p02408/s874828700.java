import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] a = new String[n];
        for(int x = 0; x < n; x++){
            a[x] = scan.next() + " " + scan.nextInt();
        }
        String rank = "S";
        int ranks = 1;
        boolean have = false;
        while(ranks < 5) {
            for (int card = 1; card < 14; card++){
                for(int x = 0; x < n; x++){
                    if(a[x].equals(rank + " " + card)){
                        have = true;
                    }
                }
                if (have){
                    have = false;
                }
                else{
                    System.out.println(rank + " " + card);
                }
            }
            ranks++;
            if(ranks == 2){
                rank = "H";
            }
            else if(ranks == 3){
                rank = "C";
            }
            else{
                rank = "D";
            }
        }


    }
}
