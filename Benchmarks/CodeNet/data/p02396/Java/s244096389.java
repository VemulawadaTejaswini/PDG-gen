import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int data[] = new int[10001];
        while(true){
            int n = sc.nextInt();
            data[i] = n;
            if(n == 0)break;
            i++;
            sc.nextLine();
        }

        for(i = 0; data[i] != 0; i++){
            System.out.print("Case "+(i+1)+": "+data[i]+"\n");
        }
        //System.out.println();
    }
}
