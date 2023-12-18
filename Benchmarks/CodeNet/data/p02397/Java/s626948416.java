import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0){
                break;
            }else if(a < b){
                numList.add(a);
                numList.add(b);
            }else{
                numList.add(b);
                numList.add(a);
            }
        }
        for(int i = 0; i < numList.size() / 2; i++){
            System.out.println(numList.get(i * 2) + " " + numList.get(i * 2 + 1));
        }
    }
}
