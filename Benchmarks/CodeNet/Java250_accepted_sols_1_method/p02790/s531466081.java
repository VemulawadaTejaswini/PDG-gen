import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = Integer.parseInt(scanner.next());
        b = Integer.parseInt(scanner.next());

        if(a < b){
            for(int i=0;i<b;i++)
                System.out.print(a);
        } else {
            for(int i=0;i<a;i++)
                System.out.print(b);
        }

        System.out.println("");
    }
}
