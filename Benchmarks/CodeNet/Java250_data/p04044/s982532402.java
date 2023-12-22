import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int n=s.nextInt();
        s.nextLine();
        String[] arr=new String[t];
        for(int i=0;i<t;i++){
            arr[i]=s.nextLine();
        }
        Arrays.sort(arr);
        StringBuilder str=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            str.append(arr[i]);
        }
        System.out.println(str);

    }
}
