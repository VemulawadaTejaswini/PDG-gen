import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int times = sc.nextInt();
        long max = -1000000, min = 1000000, total = 0;
        int num;

        for(int i=0; i<times; i++){
            num = sc.nextInt();
            total += num;
            if(max < num){
                max = num;
            }
            if (min > num){
                min = num;
            }
        }

        System.out.println(min + " " + max + " " +  total);

    }
}
