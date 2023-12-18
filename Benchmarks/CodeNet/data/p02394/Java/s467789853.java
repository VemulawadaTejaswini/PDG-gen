import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int w = cin.nextInt();
        int h = cin.nextInt();
        int x = cin.nextInt();
        int y = cin.nextInt();
        int r = cin.nextInt();
        
        System.out.println((x-r>=0 && y-r>=0 && x+r<=w && y+r<=h)?"Yes":"No");
    }
}
