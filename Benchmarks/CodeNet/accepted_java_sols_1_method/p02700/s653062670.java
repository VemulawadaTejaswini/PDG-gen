import java.util.*;

class Main{
    public Main(){
        Scanner SC = new Scanner(System.in);

        int A = Integer.parseInt(SC.next());
        int B = Integer.parseInt(SC.next());
        int C = Integer.parseInt(SC.next());
        int D = Integer.parseInt(SC.next());

        while(true){
            C -= B;
            if(C <= 0){
                System.out.println("Yes");
                break;
            }
            A -= D;
            if(A <= 0){
                System.out.println("No");
                break;
            }
        }
    }

    public static void main(String args[]){
        Main main = new Main();
    }
}
