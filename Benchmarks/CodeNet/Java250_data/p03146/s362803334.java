import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num = sc.nextInt();
        list.add(num);
        int count = 0;
        while(true){
            if(list.get(count) % 2 == 0){
                list.add(list.get(count)/2);
                count += 1;
            }else{
                list.add(list.get(count)*3 + 1);
                count += 1;
            }
            for(int i = 0; i < list.size() - 1; i++){
                if(list.get(i) == list.get(count)){
                    System.out.println(count + 1);
                    return;
                }
            }
        }
    }
}