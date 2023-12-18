import java.util.Scanner;


class Main{

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[] ls = new int[200001];

        ls[0] = sc.nextInt();
        ls[1] = sc.nextInt();

        int maxProfit = ls[1] - ls[0];

        int index = 2;
        while(sc.hasNextInt()){
            int next = sc.nextInt();


            for(int i = 0; i < index; i++)
                if (maxProfit < next - ls[i]) maxProfit = next - ls[i];

            ls[index] = next;
            index++;
        }


        System.out.println(maxProfit);
    }
}

