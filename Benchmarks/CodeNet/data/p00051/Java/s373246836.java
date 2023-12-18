

import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0; i<n ; i++){
            int number = scanner.nextInt();
            List<Integer> arrayNumber = new ArrayList<>();

            while (number != 0){
                arrayNumber.add(number % 10) ;
                number /= 10;
            }
            Collections.sort(arrayNumber);
            int min = calculate(arrayNumber);
            Collections.sort(arrayNumber, Collections.reverseOrder());
            int max = calculate(arrayNumber);
            System.out.println(max - min);
        }
    }

    static int calculate (List<Integer> arr){
        int size = arr.size();
        int result = 0;
        for (int i= 0; i<size; i++){
            result += arr.get(size-i-1) * Math.pow(10, i );
        }
        return result;
    }

}

