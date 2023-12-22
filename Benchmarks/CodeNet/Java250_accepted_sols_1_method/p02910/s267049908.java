import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bf.readLine().split("");
        for(int i=0; i<arr.length; i++) {
            if((i+1)%2 == 1) {
                if(!arr[i].equals("R") && !arr[i].equals("U") & !arr[i].equals("D")) {
                    System.out.println("No");
                    return;
                }
            } else {
                if(!arr[i].equals("L") && !arr[i].equals("U") & !arr[i].equals("D")) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }

}