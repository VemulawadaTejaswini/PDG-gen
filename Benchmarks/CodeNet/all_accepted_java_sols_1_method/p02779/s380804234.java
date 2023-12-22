import java.util.*;

public class Main {
    // AtCoder Beginner Contest 154
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        List<Integer> values = new ArrayList<>();
        for(int x = 0; x<N; x++){
            values.add(scanner.nextInt());
        }
        String returnVal = "YES";
        Collections.sort(values);
        for(int x=1; x<=N-1; x++){

            if(values.get(x-1).equals(values.get(x))){
                returnVal = "NO";
                break;
            }
        }

        System.out.println(returnVal);

    }




}
