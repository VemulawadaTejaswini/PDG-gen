import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        sc.nextLine();

        ArrayList<Integer> A = new ArrayList<Integer>();

        for(int i=0;i<q;i++){
            int order = sc.nextInt();
            switch (order){
                case 0:
                    int x = sc.nextInt();
                    A.add(x);
                    break;
                case 1:
                    int p = sc.nextInt();
                    System.out.println(A.get(p));
                    break;
                case 2:
                    A.remove(A.size()-1);
                    break;
            }
        }
    }
}
