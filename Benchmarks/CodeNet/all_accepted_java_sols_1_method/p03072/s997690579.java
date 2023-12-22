import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        String[] input = sc.nextLine().split(" ");

        for (int i=0; i<n; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        int count = 1;
        int nearbyHighest = array[0];
        
        for (int i=1; i<array.length; i++) {
            if (nearbyHighest <= array[i]) {
                nearbyHighest = array[i];
                count++;
            } else {
                continue;
            }
        }
        System.out.println(count);
    }
}