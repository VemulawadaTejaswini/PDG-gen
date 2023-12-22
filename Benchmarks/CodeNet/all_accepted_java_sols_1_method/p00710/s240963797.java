import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        while (true){
            int num = scn.nextInt();
            int count = scn.nextInt();

            if(num == 0 && count == 0) break;

            int x[];
            x = new int[num];
            int tmp[];

            for(int i = 0; i < num; i++){
                x[i] = num - i;
            }
            
            for(int i = 0; i < count; i++){
                int num1 = scn.nextInt();
                int num2 = scn.nextInt();
                tmp = new int[num1  + num2 - 1];

                for(int j = num1 - 1; j < num1 + num2 - 1; j++){
                    tmp[j - (num1 - 1)] = x[j];
                }

                for(int j = num2; j < num1 + num2 - 1; j++){
                    tmp[j] = x[j - num2];
                }

                for(int j = 0; j < num1 + num2 - 1; j++){
                    x[j] = tmp[j];
                }
            }
            System.out.println(x[0]);
        }
    }
}
