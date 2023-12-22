import java.util.Scanner;
import java.util.ArrayList;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1;i <= num; i++){
            if (num%i == 0) {
                
                list.add(i);
            }
        }

        ArrayList<Integer> listB = new ArrayList<Integer>();
        for (int j = 0;j < list.size(); j++){
            if (a <= list.get(j) && list.get(j)<= b) {
                listB.add(j);
            }
        }
        // listBの要素数が答えになる
        
        System.out.println(listB.size());
    }
}
