import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            list.add(sc.nextInt());
        }
      
        int min = 100000000;

        for(int number : list) {
            int count = 0;

            while(number % 2 == 0) {
                number /= 2;
                count++;
            }

            if(min > count) {
                min = count;
            }
        }

        System.out.println(min);
    }
}