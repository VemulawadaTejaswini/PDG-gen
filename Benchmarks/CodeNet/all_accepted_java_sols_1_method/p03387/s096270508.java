import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] l = new int[3];
        for(int i = 0;i < 3;i++)    l[i] = sc.nextInt();
        Arrays.sort(l);
        if(l[0] == l[2]){
            System.out.println(0);
            return;
        }
        if((l[1]-l[0])%2 == 0)    System.out.println((2*l[2]-l[1]-l[0])/2);
        else    System.out.println((2*l[2]-l[1]-l[0]-1)/2+2);
    }
}