import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n=sc.nextInt();
        int j=n;
        while(j-->0){
            list.add(sc.nextInt());
        }
        for(int i=n-1;i>0;i--) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list.get(0));
    }
}
