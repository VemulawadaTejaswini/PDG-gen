import java.util.Scanner;

class Main{
    public static void main(String[] args) throws Exception{

        int num = 10000;

        Scanner sc = new Scanner(System.in);
        int[] x = new int[num];

        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(sc.next());
            if(x[i] == 0){
                break;
            }
            System.out.println("Case 1: " + x[i]);
        }


    }
}