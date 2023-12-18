import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        int money = 1000;
        int kabu = 0;

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Mylist = new ArrayList<Integer>();
        int N = sc.nextInt();
        for(int i = 0;i<N;i++){
            int t = sc.nextInt();
            Mylist.add(t);
        }

        for(int j = 0;j<N-1;j++){
            if (Mylist.get(j) >= Mylist.get(j+1)){
                money = kabu*Mylist.get(j) + money;
                kabu = 0;
            }
            else {
                kabu = money/Mylist.get(j);
                money = money%Mylist.get(j);
            }
            
        }
      	money = kabu*Mylist.get(N-1) + money;
        kabu = 0;
        System.out.println(money);
    }
}